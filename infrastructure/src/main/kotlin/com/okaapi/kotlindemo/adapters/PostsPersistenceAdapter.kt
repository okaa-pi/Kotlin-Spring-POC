package com.okaapi.kotlindemo.adapters

import com.okaapi.kotlindemo.model.Post
import com.okaapi.kotlindemo.model.PostEntity
import com.okaapi.kotlindemo.ports.PostsPersistencePort
import com.okaapi.kotlindemo.repositories.PostsRepository
import org.springframework.stereotype.Service

@Service
class PostsPersistenceAdapter(private val postsRepository: PostsRepository) : PostsPersistencePort {
    override fun getPosts(): List<Post> {
        return postsRepository.findAll().map(PostEntity::toPost)
    }
}