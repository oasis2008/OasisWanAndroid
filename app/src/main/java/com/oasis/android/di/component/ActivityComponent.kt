package com.oasis.android.di.component

import com.oasis.android.di.PerActivity
import com.oasis.android.di.module.ActivityModule
import com.oasis.android.ui.login.LoginActivity
import dagger.Component

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class),
    modules = arrayOf(ActivityModule::class)
    )
interface ActivityComponent {
    fun inject(loginActivity: LoginActivity)
}