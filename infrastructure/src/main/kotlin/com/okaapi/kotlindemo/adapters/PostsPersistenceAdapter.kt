package com.okaapi.kotlindemo.adapters

import com.okaapi.kotlindemo.model.Post
import com.okaapi.kotlindemo.ports.PostsPersistencePort
import org.springframework.stereotype.Service

@Service
class PostsPersistenceAdapter : PostsPersistencePort {
    override fun getPosts(): List<Post> {
        return listOf(
                Post("Toto", "Tutu"),
                Post("Lolo", "Lulu")
        )
    }
}