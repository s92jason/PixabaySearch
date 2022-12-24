package com.jasonchen.gogolooksearch.data.model.searchImages

data class SearchImageReq(
    var q: String,
    var page: Int,
    var image_type: String = "all",
) {
    companion object {
        const val DEFAULT_PAGE_BEGIN_INDEX = 1
    }

    fun getParams(): Map<String, String> {
        val params  = mutableMapOf<String, String>()

        params.setParam("q", q)
        params.setParam("page", page.toString())
        params.setParam("image_type", image_type)

        return params
    }

    private fun MutableMap<String, String>.setParam(paramName: String, param: String) {
        if (param.isNotEmpty()) {
            this[paramName] = param
        }
    }
}