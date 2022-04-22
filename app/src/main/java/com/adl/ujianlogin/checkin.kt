package com.adl.ujianlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.adl.ujianlogin.model.ResponseAddData
import com.adl.ujianlogin.Services.retrofit

import kotlinx.android.synthetic.main.activity_checkin.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
class checkin : AppCompatActivity() {

    var addImage:Boolean=false
    var isDone:Boolean=false
    lateinit var tanggalSekarang:String
    lateinit var lokasi:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkin)

        if (it.resultCode == Activity.RESULT_OK) {
            val uri = it.data?.data!!

            Photo.setImageURI(uri)
            photoURI=uri
            addImage=true
    }
}