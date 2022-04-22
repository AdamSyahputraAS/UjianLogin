package com.adl.ujianlogin.model

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(

    @field:SerializedName("table_user")
    val tableUser: List<TableUserItem?>? = null
) : Parcelable

@Parcelize
data class TableUserItem(

    @field:SerializedName("password")
    val password: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("username")
    val username: String? = null
) : Parcelable