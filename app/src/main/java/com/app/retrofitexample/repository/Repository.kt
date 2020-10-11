package com.app.retrofitexample.repository

import com.app.retrofitexample.api.RetrofitInstance
import com.app.retrofitexample.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }
}