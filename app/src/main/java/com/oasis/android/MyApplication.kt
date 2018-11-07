package com.oasis.android

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import com.androidnetworking.AndroidNetworking
import com.oasis.android.di.component.ApplicationComponent
import com.oasis.android.di.component.DaggerApplicationComponent
import com.oasis.android.di.module.ApplicationModule
import kotlin.properties.Delegates

/**
 * @author Oasis Yao
 *Created on 2018/11/2.
 */
class MyApplication : Application() {

    companion object {
        private val TAG = "MyApplication"

        var context: Context by Delegates.notNull()
            private set

        var mApplicationComponent: ApplicationComponent by Delegates.notNull()
            private set
    }

    override fun onCreate() {
        super.onCreate()

        context = applicationContext

        registerActivityLifecycleCallbacks(mActivityLifecycleCallbacks)

        AndroidNetworking.initialize(applicationContext)

        mApplicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this)).build()
        mApplicationComponent.inject(this)
    }

    private val mActivityLifecycleCallbacks = object : Application.ActivityLifecycleCallbacks {

        override fun onActivityPaused(activity: Activity?) {
        }

        override fun onActivityResumed(activity: Activity?) {
        }

        override fun onActivityStarted(activity: Activity?) {
        }

        override fun onActivityDestroyed(activity: Activity?) {
        }

        override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
        }

        override fun onActivityStopped(activity: Activity?) {
        }

        override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {

        }
    }
}