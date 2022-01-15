package com.example.hightone.minseo


import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

data class ResponseEmail(var email : String? = null)

interface ServiceApi {

    @FormUrlEncoded
    @POST("/api/v1/account/signup")
    fun requestSignUp(
        @Field("name") name:String,
        @Field("id") id:String,
        @Field("password") password:String,
        @Field("email") email:String,
        @Field("schoolType") schoolType:String,
        @Field("grade") grade:Int,
        @Field("Class") Class:Int,
        @Field("number") number:Int,
    ) : Call<SignUpData>


    @POST("/api/v1/account/authorize")
    fun postRequest(@Field("Email")Email : String):Call<ResponseEmail>
}