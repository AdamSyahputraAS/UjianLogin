package com.adl.ujianlogin.model

import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface UserAPI {

    @Headers("X-Api-Key:380B1D5033FF4BD81107A1F047AF4371")
    @GET("api/loginabsen/all?")
    fun getlogin(
        @Query("filter")query:String
    ): Call<userResponse>

    @Multipart
    @Headers("X-Api-Key:380B1D5033FF4BD81107A1F047AF4371")
    @POST("api/loginabsen/add")
    fun addDataAndImage(@Part file: MultipartBody.Part, @Part("username") username: RequestBody,
                        @Part("tanggal_masuk")tanggal_masuk:RequestBody, @Part("tanggal_keluar")tanggal_keluar:RequestBody,
                        @Part("lokasi_GPS")lokasi_GPS:RequestBody):Call<ResponseAddData>

}
