package com.app.retrofitexample.api

import com.app.retrofitexample.model.Post
import retrofit2.Response
import retrofit2.http.GET

public interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Response<Post>

}