package com.oasis.android.data.prefs

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
interface PreferencesHelper {
    fun getCurrentUserId():Long
    fun setCurrentUserId(id:Long)

    fun getCurrentUserName():String
    fun setCurrentUserName(name:String)

    fun getCurrentLoggedInMode():Int
    fun setCurrentLoggedInMode(mode:Int)

}