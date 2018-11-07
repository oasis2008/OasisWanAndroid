package com.oasis.android.data.network

import com.oasis.android.data.network.model.LoginRequest
import com.oasis.android.data.network.model.LoginResponse
import io.reactivex.Single

/**
 * @author Oasis Yao
 * Created on 2018/11/5.
 */
interface ApiHelper{
    fun  doLoginApiCall(request:LoginRequest) : Single<LoginResponse>
}
