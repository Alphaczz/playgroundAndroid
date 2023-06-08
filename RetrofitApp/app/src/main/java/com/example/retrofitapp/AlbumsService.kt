package com.example.retrofitapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AlbumsService
{
    // u shuld specify endpoint of url
    @GET("/albums")
    suspend fun getAblums():Response<Albums>
    @GET("/albums")
    suspend fun  getSpecificId(@Query("userId") userId:Int):Response<Albums>

}