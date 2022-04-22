package com.adl.ujianlogin.model

import retrofit2.Call
import retrofit2.http.*

interface UserAPI {

    @Headers("X-Api-Key:380B1D5033FF4BD81107A1F047AF4371")
    @GET("api/loginabsen/all")
    fun getlogin(
        @Query("filter")filter:String
    ): Call<userResponse>
}