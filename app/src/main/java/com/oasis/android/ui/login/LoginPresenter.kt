package com.oasis.android.ui.login

import android.text.TextUtils
import android.util.Log
import com.oasis.android.data.DataManager
import com.oasis.android.data.network.model.LoginRequest
import com.oasis.android.ui.base.BasePresenter
import com.oasis.android.utils.rxandroid.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Consumer
import javax.inject.Inject

/**
 * @author Oasis Yao
 *Created on 2018/11/6.
 */
class LoginPresenter<V:LoginMvpView>
    @Inject constructor(dataManager: DataManager,
                        schedulerProvider: SchedulerProvider,
                        compositeDisposable:CompositeDisposable)
    :BasePresenter<V>(dataManager,schedulerProvider,compositeDisposable),LoginMvpPresenter<V>{


    override fun login(name: String, password: String) {
        if(TextUtils.isEmpty(name)){
            mvpView?.showMessage("Please enter your userName!")
            return
        }

        if(TextUtils.isEmpty(password)){
            mvpView?.showMessage("Please enter your password!")
            return
        }

        compositeDisposable.add(
            dataManager.doLoginApiCall(LoginRequest(name,password))
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(Consumer {
                    Log.d("yxc","it = " + it.data.toString())
                    if(it.errorCode == 0){
                        dataManager.updateUserInfo(it.data.id,it.data.username,it.data.icon,it.data.email)
                        mvpView?.openMainPage()
                    }
                })
        )

    }

}