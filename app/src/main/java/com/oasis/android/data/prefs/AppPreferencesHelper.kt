package com.oasis.android.data.prefs

import android.content.Context
import android.content.SharedPreferences
import com.oasis.android.data.DataManager
import com.oasis.android.di.ActivityContext
import com.oasis.android.di.PreferenceInfo
import com.oasis.android.utils.AppConstants
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */

@Singleton
class AppPreferencesHelper @Inject constructor(
    @ActivityContext context: Context,
    @PreferenceInfo name: String
) : PreferencesHelper {

    private var mPrefs:SharedPreferences

    companion object {
        val PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID"
        val PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME"
        val PREF_KEY_CURRENT_USER_LOGGEDIN_MODE = "PREF_KEY_CURRENT_USER_LOGGEDIN_MODE"
    }

    init {
        mPrefs = context.getSharedPreferences(name,Context.MODE_PRIVATE)
    }

    override fun getCurrentUserId(): Long {
        return mPrefs.getLong(PREF_KEY_CURRENT_USER_ID,AppConstants.NULL_INDEX)
    }

    override fun setCurrentUserId(id: Long) {
        mPrefs.edit().putLong(PREF_KEY_CURRENT_USER_ID,id).apply()
    }

    override fun getCurrentUserName(): String {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_NAME,AppConstants.NULL_CHARACTER)
    }

    override fun setCurrentUserName(name: String) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_NAME,name).apply()
    }

    override fun getCurrentLoggedInMode(): Int {
        return mPrefs.getInt(PREF_KEY_CURRENT_USER_LOGGEDIN_MODE,DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_ACCOUNT.ordinal)
    }

    override fun setCurrentLoggedInMode(mode: Int) {
       mPrefs.edit().putInt(PREF_KEY_CURRENT_USER_LOGGEDIN_MODE,mode).apply()
    }
}