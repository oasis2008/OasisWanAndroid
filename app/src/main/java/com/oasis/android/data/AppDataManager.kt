package com.oasis.android.data

import com.oasis.android.data.network.ApiHelper
import com.oasis.android.data.network.model.LoginRequest
import com.oasis.android.data.network.model.LoginResponse
import com.oasis.android.data.prefs.PreferencesHelper
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */

@Singleton
class AppDataManager @Inject constructor(preferencesHelper: PreferencesHelper,apiHelper: ApiHelper):DataManager{

    private  val mPreferencesHelper:PreferencesHelper
    private  val mApiHelper:ApiHelper

    init {
        mPreferencesHelper = preferencesHelper
        mApiHelper = apiHelper
    }

    override fun getCurrentUserId(): Long {
        return mPreferencesHelper.getCurrentUserId()
    }

    override fun setCurrentUserId(id: Long) {
       mPreferencesHelper.setCurrentUserId(id)
    }

    override fun getCurrentUserName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCurrentUserName(name: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCurrentLoggedInMode(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCurrentLoggedInMode(mode: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setUserAsLoggedOut() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun doLoginApiCall(request: LoginRequest): Single<LoginResponse> {
        return mApiHelper.doLoginApiCall(request)
    }

    override fun updateUserInfo(id: Long, name: String, icon: String, email: String) {



        mPreferencesHelper.setCurrentUserId(id)
        mPreferencesHelper.setCurrentUserName(name)
        mPreferencesHelper.setCurrentLoggedInMode(DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_ACCOUNT.ordinal)
    }
}