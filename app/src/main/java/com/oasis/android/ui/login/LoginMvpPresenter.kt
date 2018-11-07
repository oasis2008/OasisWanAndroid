package com.oasis.android.ui.login

import com.oasis.android.di.PerActivity
import com.oasis.android.ui.base.MvpPresenter

/**
 * @author Oasis Yao
 *Created on 2018/11/6.
 */

@PerActivity
interface LoginMvpPresenter<V:LoginMvpView>:MvpPresenter<V> {
    fun login(name:String,password:String)
}