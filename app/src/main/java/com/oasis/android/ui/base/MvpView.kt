package com.oasis.android.ui.base

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
interface MvpView {
    fun showLoading()
    fun hideLoading()
    fun onError(message:String)
    fun showMessage(message: String)
    fun hideKeyboard()
    fun isNetWorkConnected()
}