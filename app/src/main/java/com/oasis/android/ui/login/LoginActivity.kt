package com.oasis.android.ui.login

import android.os.Bundle
import com.oasis.android.R
import com.oasis.android.ui.base.BaseActivity
import javax.inject.Inject

/**
 * @author Oasis Yao
 *Created on 2018/11/2.
 */
class LoginActivity :BaseActivity(),LoginMvpView{

    @Inject
    lateinit var loginMvpPresenter:LoginMvpPresenter<LoginMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent.inject(this)
        loginMvpPresenter.onAttach(this)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_login
    }

    override fun onResume() {
        super.onResume()
        loginMvpPresenter.login("oasis2008","oasis999")
    }


    override fun openMainPage() {

    }
}