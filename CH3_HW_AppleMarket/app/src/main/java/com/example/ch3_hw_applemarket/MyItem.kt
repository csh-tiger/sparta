package com.example.ch3_hw_applemarket

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyItem(val aItem:Int, val aTitle:String, val aAddress:String, val aPrice:String, val aLike:String, val aChat:String, val aIntroduce:String, val aNickname:String): Parcelable {}
