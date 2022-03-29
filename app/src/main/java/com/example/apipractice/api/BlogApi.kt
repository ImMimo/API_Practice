package com.example.apipractice.api

import com.example.apipractice.models.Post
import retrofit2.http.GET

interface BlogApi {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}