package com.oasis.android.ui.base

import com.oasis.android.data.DataManager
import com.oasis.android.utils.rxandroid.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
open class BasePresenter<V : MvpView>
constructor(
    val dataManager: DataManager,
    val schedulerProvider: SchedulerProvider,
    val compositeDisposable: CompositeDisposable
) : MvpPresenter<V> {

    var mvpView: V? = null
        private set

    override fun onAttach(mvpView: V) {
       this.mvpView = mvpView
    }

    override fun onDetach() {
        this.mvpView = null
        compositeDisposable.dispose()
    }

    override fun handleApiError(type: Int) {
        when(type){

        }
    }

    override fun setUserAsLoggedOut() {
        dataManager.setUserAsLoggedOut()
    }
}