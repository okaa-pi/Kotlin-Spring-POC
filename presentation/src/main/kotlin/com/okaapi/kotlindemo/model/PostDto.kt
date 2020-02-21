package com.okaapi.kotlindemo.model

data class PostDto(var title: String, var content: String)

suspend fun Post.toDto() = PostDto(title, content)