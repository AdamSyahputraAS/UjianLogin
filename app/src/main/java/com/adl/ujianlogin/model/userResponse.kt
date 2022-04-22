package com.adl.ujianlogin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class userResponse {

    @SerializedName("data")
    @Expose
    var data: User?= null

    class User{
        @SerializedName("username")
        @Expose
        var username: String?=null

        @SerializedName("password")
        @Expose
        var token: String?=null

    }
}