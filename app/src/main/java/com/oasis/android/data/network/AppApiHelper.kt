package com.oasis.android.data.network

import com.oasis.android.data.network.model.LoginRequest
import com.oasis.android.data.network.model.LoginResponse
import com.oasis.android.data.prefs.PreferencesHelper
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */

@Singleton
class AppApiHelper @Inject constructor(val preferencesHelper: PreferencesHelper):ApiHelper{

    override fun doLoginApiCall(request: LoginRequest): Single<LoginResponse> {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENIDPONIT_LOGIN)
            .addBodyParameter("username",request.userName)
            .addBodyParameter("password",request.password)
            .build()
            .getObjectSingle(LoginResponse::class.java)
    }

}