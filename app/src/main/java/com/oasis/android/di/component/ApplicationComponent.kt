package com.oasis.android.di.component

import android.app.Application
import android.content.Context
import com.oasis.android.MyApplication
import com.oasis.android.data.DataManager
import com.oasis.android.di.ActivityContext
import com.oasis.android.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(app:MyApplication)

    @ActivityContext
    fun context():Context

    fun application():Application

    fun getDataManager():DataManager
}