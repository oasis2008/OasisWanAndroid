package com.oasis.android.data

import com.oasis.android.data.network.ApiHelper
import com.oasis.android.data.prefs.PreferencesHelper

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
interface DataManager:ApiHelper,PreferencesHelper{

    fun updateUserInfo(id:Long,name:String,icon:String,email:String)
    fun setUserAsLoggedOut()

    enum class LoggedInMode{
        LOGGED_IN_MODE_LOGGED_OUT,
        LOGGED_IN_MODE_LOGGED_ACCOUNT
    }

}