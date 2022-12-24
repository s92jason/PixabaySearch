package com.jasonchen.gogolooksearch.view.ui

import android.graphics.pdf.PdfDocument.Page
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jasonchen.gogolooksearch.Constants.PREF_KEY_RESULT_LAYOUT_TYPE
import com.jasonchen.gogolooksearch.Constants.PREF_KEY_SEARCH_HISTORY
import com.jasonchen.gogolooksearch.Constants.ResultLayoutType
import com.jasonchen.gogolooksearch.MyApplication
import com.jasonchen.gogolooksearch.R
import com.jasonchen.gogolooksearch.data.model.searchImages.Hit
import com.jasonchen.gogolooksearch.data.model.searchImages.SearchImageReq
import com.jasonchen.gogolooksearch.data.model.searchImages.SearchImageReq.Companion.DEFAULT_PAGE_BEGIN_INDEX
import com.jasonchen.gogolooksearch.data.model.searchImages.SearchImagesRes
import com.jasonchen.gogolooksearch.repository.repo.PixabayRepository
import com.jasonchen.gogolooksearch.utils.SharedPrefUtil
import com.jasonchen.gogolooksearch.view.base.BaseViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val application: MyApplication,
    private val repository: PixabayRepository,
    private val sharedPrefUtil: SharedPrefUtil
) : BaseViewModel(application) {
    private val _resultLayoutType = MutableLiveData<ResultLayoutType>()
    val resultLayoutType: LiveData<ResultLayoutType>
        get() = _resultLayoutType

    private val _searchState = MutableLiveData<SearchViewState>()
    val searchState: LiveData<SearchViewState>
        get() = _searchState

    private val _searchHistory = MutableLiveData<MutableList<String>>()
    val searchHistory: LiveData<MutableList<String>>
        get() = _searchHistory

    private var cacheKeyword = ""
    private var reqPage = DEFAULT_PAGE_BEGIN_INDEX
    private var totalHits = 0
    var hits: MutableList<Hit> = mutableListOf()
        private set

    init {
        val typeIndex = sharedPrefUtil.get(PREF_KEY_RESULT_LAYOUT_TYPE, ResultLayoutType.GRID.index)
        _resultLayoutType.value = ResultLayoutType.getLayoutType(typeIndex)

        val searchHistorySet = sharedPrefUtil.get(PREF_KEY_SEARCH_HISTORY, mutableSetOf())
        _searchHistory.value = searchHistorySet.toMutableList()
    }

    fun searchImages(keyword: String = cacheKeyword, isNewSearch: Boolean) {
        if (isNewSearch) {
            if (!isKeywordValid(keyword)) {
                return
            }
            clearCacheRequestParams()

            saveKeywordHistory(keyword)
            cacheKeyword = keyword
        } else {
            if ((totalHits - 1) == reqPage) {
                return
            }
        }


        val req = packageSearchImagesParams(cacheKeyword, reqPage)
        sendSearchImagesApi(req)
    }

    fun switchResultLayoutType() {
        if (resultLayoutType.value == ResultLayoutType.LIST) {
            _resultLayoutType.value = ResultLayoutType.GRID
        } else {
            _resultLayoutType.value = ResultLayoutType.LIST
        }

        resultLayoutType.value?.let { sharedPrefUtil.put(PREF_KEY_RESULT_LAYOUT_TYPE, it.index) }
    }

    fun isLoading(): Boolean {
        return searchState.value == SearchLoading
    }

    private fun isKeywordValid(keyword: String): Boolean {
        if (keyword.isEmpty()) {
            _searchState.value =
                SearchError(errorMsg = application.getString(R.string.search_fragment_key_word_empty_error))
            return false
        }
        return true
    }

    private fun clearCacheRequestParams() {
        cacheKeyword = ""
        reqPage = DEFAULT_PAGE_BEGIN_INDEX
        hits = mutableListOf()
    }

    private fun saveKeywordHistory(keyword: String) {
        val historyList = _searchHistory.value ?: return

        if (historyList.contains(keyword)) {
            historyList.remove(keyword)
        }

        historyList.add(keyword)
        _searchHistory.value = historyList
        _searchHistory.value?.let { sharedPrefUtil.put(PREF_KEY_SEARCH_HISTORY, it.toSet()) }
    }

    private fun packageSearchImagesParams(keyword: String, page: Int): Map<String, String> {
        val req = SearchImageReq(keyword, page)
        return req.getParams()
    }

    private fun sendSearchImagesApi(params: Map<String, String>) {
        _searchState.value = SearchLoading

        CoroutineScope(Dispatchers.IO).launch {
            withContext(Dispatchers.Main) {
                runCatching { repository.sendSearchImages(params) }
                    .onSuccess {
                        val res = it.body() as SearchImagesRes
                        hits = updateNewHits(hits, res.hits)
                        totalHits = res.totalHits
                        //下一次Request用
                        reqPage++
                        _searchState.value = SearchSuccess(hits)
                    }
                    .onFailure { }
            }
        }
    }

    /**
     * 需透過換新的List來避免原本List call by reference 造成資料同步更新問題
     */
    private fun updateNewHits(oldHits: List<Hit>, newHits: List<Hit>): MutableList<Hit> {
        val result = mutableListOf<Hit>()
        result.addAll(oldHits)
        result.addAll(newHits)
        return result
    }

    sealed class SearchViewState
    object SearchInitial : SearchViewState()
    object SearchLoading : SearchViewState()
    data class SearchSuccess(val hits: List<Hit>) : SearchViewState()
    data class SearchError(val errorCode: String = "", val errorMsg: String) : SearchViewState()
}