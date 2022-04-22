package com.adl.ujianlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.adl.ujianlogin.Services.retrofit
import com.adl.ujianlogin.model.UserAPI
import com.adl.ujianlogin.model.userRequest
import com.adl.ujianlogin.model.userResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAction()

    }

    fun initAction(){

        btnLogin.setOnClickListener{
            login()
        }
    }

    fun login(){
        retrofit().getUser().getlogin(inputUsername.text.toString()).enqueue(object: Callback<userResponse>{
            override fun onResponse(
                call: Call<userResponse>,
                response: Response<userResponse>
            ) {
                var data = response.body()?.data?.tableUser

                if(response.isSuccessful){
                    Log.d("data","${data}")
                    if (data?.size == 0){
                        Toast.makeText(this@MainActivity,"Username or Password is doesn't found",Toast.LENGTH_LONG).show()
                    }else{

                        var currentUser = response.body()?.data?.loginabsen?.get(0)
                        if(currentUser?.password == inputUsername.text.toString()){
                            Toast.makeText(this@MainActivity,"Login Successfull",Toast.LENGTH_SHORT).show()
                            val intent = Intent(this@MainActivity, main_menu::class.java)
                            intent.putExtra("data", currentUser)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this@MainActivity,"Incorrect password",Toast.LENGTH_LONG).show()
                        }

                    }
                }else{
                    Toast.makeText(this@MainActivity,"username and password can't empty",Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<userResponse>, t: Throwable) {

            }

        })

    }
}