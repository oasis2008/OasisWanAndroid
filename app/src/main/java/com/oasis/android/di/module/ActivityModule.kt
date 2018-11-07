package com.oasis.android.di.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.oasis.android.di.ActivityContext
import com.oasis.android.di.PerActivity
import com.oasis.android.ui.login.LoginMvpPresenter
import com.oasis.android.ui.login.LoginMvpView
import com.oasis.android.ui.login.LoginPresenter
import com.oasis.android.utils.AppSchedulerProvider
import com.oasis.android.utils.rxandroid.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */

@Module
class ActivityModule constructor(var activity: AppCompatActivity){


    @Provides
    @ActivityContext
    fun provideContext():Context{
        return activity
    }

    @Provides
    fun provideActivity():AppCompatActivity{
        return activity
    }

    @Provides
    fun provideCompositeDisposable():CompositeDisposable{
        return CompositeDisposable()
    }

    @Provides
    fun provideAppSchedulerProvider():SchedulerProvider{
        return AppSchedulerProvider()
    }

    @Provides
    @PerActivity
    fun provideLoginPresenter(presenter: LoginPresenter<LoginMvpView>):LoginMvpPresenter<LoginMvpView>{
        return  presenter
    }

}
