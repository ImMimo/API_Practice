package com.example.apipractice.api

import com.example.apipractice.models.Post
import com.example.apipractice.models.User
import retrofit2.http.GET

interface BlogApi {
    @GET("posts")
    suspend fun getPosts(): List<Post>

    @GET("users")
    suspend fun getUsers(): List<User>

}