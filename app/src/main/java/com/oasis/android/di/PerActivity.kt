package com.oasis.android.di

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * @author Oasis Yao
 * Created on 2018/11/5.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class PerActivity
