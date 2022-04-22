package com.adl.ujianlogin.Services

import com.adl.ujianlogin.model.UserAPI
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class retrofit {

    fun getInterceptor(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return okHttpClient


    }
    fun getRetrofitInstance(): Retrofit{
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("http://192.168.1.129/cicool/")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
    fun getUser() = getRetrofitInstance().create(UserAPI::class.java)
}