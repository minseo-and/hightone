package com.example.hightone.minseo

import retrofit2.http.Field

data class SignUpData (
        val name:String,
        val id:String,
        val password:String,
        val email:String,
        val schoolType:String,
        val grade:Int,
        val Class:Int,
        val number:Int,
        )