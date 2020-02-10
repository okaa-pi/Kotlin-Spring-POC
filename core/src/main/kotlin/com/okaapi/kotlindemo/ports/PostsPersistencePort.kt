package com.okaapi.kotlindemo.ports

import com.okaapi.kotlindemo.model.Post

interface PostsPersistencePort {
    fun getPosts(): List<Post>
}