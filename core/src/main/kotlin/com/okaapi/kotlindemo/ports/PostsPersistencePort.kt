package com.okaapi.kotlindemo.ports

import com.okaapi.kotlindemo.model.Post
import kotlinx.coroutines.flow.Flow

interface PostsPersistencePort {
    suspend fun getPosts(): Flow<Post>
}