package com.okaapi.kotlindemo.services

import com.okaapi.kotlindemo.ports.PostsPersistencePort
import org.springframework.stereotype.Service

@Service
class PostsService(val persistencePort: PostsPersistencePort) {

    fun getPosts() = persistencePort.getPosts()

}