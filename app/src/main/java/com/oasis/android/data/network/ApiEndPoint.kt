package com.oasis.android.data.network

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
class ApiEndPoint private constructor() {

    companion object {
        private val BASE_URL = "http://www.wanandroid.com/"
        val ENIDPONIT_LOGIN = BASE_URL + "user/login"
    }

}