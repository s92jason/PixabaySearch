package com.jasonchen.gogolooksearch.utils

import android.view.View

object AppUtils {
    private const val DOUBLE_CLICK_INTERVAL: Long = 500
    private var m_lLastClickTime: Long = 0
    val isDoubleClick: Boolean
        get() {
            val lCurr = System.currentTimeMillis()
            val bRet = lCurr - m_lLastClickTime <= DOUBLE_CLICK_INTERVAL
            if (!bRet) {
                m_lLastClickTime = lCurr
            }
            return bRet
        }

    fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
        val safeOnClickListener = SafeOnClickListener {
            onSafeClick(it)
        }
        setOnClickListener(safeOnClickListener)
    }
}

class SafeOnClickListener(private val onSafeClick: (View) -> Unit) : View.OnClickListener {
    override fun onClick(v: View) {
        if (AppUtils.isDoubleClick) {
            return
        }
        onSafeClick(v)
    }
}