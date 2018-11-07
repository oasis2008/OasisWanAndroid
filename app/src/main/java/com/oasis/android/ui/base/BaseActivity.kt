package com.oasis.android.ui.base

import android.app.ProgressDialog
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.Unbinder
import com.oasis.android.MyApplication
import com.oasis.android.di.component.ActivityComponent
import com.oasis.android.di.component.DaggerActivityComponent
import com.oasis.android.di.module.ActivityModule
import com.oasis.android.utils.DialogUtils

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
abstract class BaseActivity: AppCompatActivity(),MvpView {

    lateinit var activityComponent:ActivityComponent
    lateinit var dialog: ProgressDialog
    lateinit var unbinder: Unbinder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent = DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .applicationComponent(MyApplication.mApplicationComponent)
            .build()
        val layoutId = getLayoutId()

        if(layoutId > 0){
            setContentView(getLayoutId())
            unbinder = ButterKnife.bind(this)
        }
    }

    @LayoutRes
    abstract fun getLayoutId():Int

    override fun showLoading() {
        dialog = DialogUtils.showLoadingDialog(this)
    }

    override fun hideLoading() {
        DialogUtils.dismissLoadingDialog(dialog)
    }

    override fun onError(message: String) {

    }

    override fun showMessage(message: String) {

    }

    override fun hideKeyboard() {

    }

    override fun isNetWorkConnected() {

    }

    override fun onDestroy() {
        super.onDestroy()
        unbinder?.unbind()
    }

}