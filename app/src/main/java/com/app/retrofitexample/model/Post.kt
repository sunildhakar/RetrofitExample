package com.app.retrofitexample.model

import com.google.gson.annotations.SerializedName

open class Post(
    //@SerializedName("userId")
    var userId: Int,
    var id: Int,
    var title: String,
    var body: String
)