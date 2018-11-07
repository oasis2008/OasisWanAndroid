package com.oasis.android.data.network.model

/**
 * @author Oasis Yao
 * Created on 2018/11/5.
 */
class LoginResponse {


    /**
     * data : {"chapterTops":[],"collectIds":[],"email":"641296167@qq.com","icon":"","id":12493,"password":"*******","token":"","type":0,"username":"oasis2008"}
     * errorCode : 0
     * errorMsg :
     */

    lateinit var data: DataBean
    var errorCode: Int = 0
    var errorMsg: String? = null

    class DataBean {
        /**
         * chapterTops : []
         * collectIds : []
         * email : 641296167@qq.com
         * icon :
         * id : 12493
         * password : *******
         * token :
         * type : 0
         * username : oasis2008
         */

        var email: String = ""
        var icon: String = ""
        var id: Long = 0
        var password: String = ""
        var token: String = ""
        var type: Int = 0
        var username: String = ""
        var chapterTops: List<*>? = null
        var collectIds: List<*>? = null

        override fun toString(): String {
            return "DataBean(email=$email, icon=$icon, id=$id, password=$password, token=$token, type=$type, username=$username, chapterTops=$chapterTops, collectIds=$collectIds)"
        }
    }
}
