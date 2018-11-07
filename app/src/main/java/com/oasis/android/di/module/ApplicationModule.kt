package com.oasis.android.di.module

import android.app.Application
import android.content.Context
import com.oasis.android.data.AppDataManager
import com.oasis.android.data.DataManager
import com.oasis.android.data.network.ApiHelper
import com.oasis.android.data.network.AppApiHelper
import com.oasis.android.data.prefs.AppPreferencesHelper
import com.oasis.android.data.prefs.PreferencesHelper
import com.oasis.android.di.ActivityContext
import com.oasis.android.di.PreferenceInfo
import com.oasis.android.utils.AppConstants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */

@Module
class ApplicationModule constructor(var application: Application){

    @Provides
    @ActivityContext
    fun provideContext():Context{
        return application
    }

    @Provides
    fun provideApplication():Application{
        return application
    }

    @Provides
    @PreferenceInfo
    fun providePreferenceName():String{
        return AppConstants.DB_NAME
    }

    @Provides
    @Singleton
    fun provideDataManager(appDataManager:AppDataManager):DataManager{
        return appDataManager
    }

    @Provides
    @Singleton
    fun providePreferenceHelper(appPreferencesHelper: AppPreferencesHelper):PreferencesHelper{
        return appPreferencesHelper
    }


    @Provides
    @Singleton
    fun provideApiHelper(appApiHelper: AppApiHelper):ApiHelper{
        return appApiHelper
    }
}