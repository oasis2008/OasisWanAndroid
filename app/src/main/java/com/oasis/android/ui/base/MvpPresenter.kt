package com.oasis.android.ui.base

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
interface MvpPresenter<V:MvpView> {
    fun onAttach(mvpView: V)
    fun onDetach()
    fun handleApiError(type:Int)
    fun setUserAsLoggedOut()
}