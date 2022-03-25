package com.vyw.tflite

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("post")
    fun getPosts(): Call<ArrayList<PostResponse>>
}