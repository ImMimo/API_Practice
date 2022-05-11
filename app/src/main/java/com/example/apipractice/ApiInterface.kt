package com.example.apipractice

import com.example.apipractice.models.Post
import com.example.apipractice.models.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("posts")
    fun getData(): Call<List<MyDataItem>>

    @GET("posts")
    fun getPosts(): Call<List<Post>>

    @GET("users")
    fun getUsers(): Call<List<User>>
}