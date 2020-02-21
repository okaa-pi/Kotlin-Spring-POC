package com.okaapi.kotlindemo.adapters

import com.okaapi.kotlindemo.model.Post
import com.okaapi.kotlindemo.model.PostEntity
import com.okaapi.kotlindemo.ports.PostsPersistencePort
import com.okaapi.kotlindemo.repositories.PostsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.reactive.asFlow
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class PostsPersistenceAdapter(private val postsRepository: PostsRepository) : PostsPersistencePort {
    override suspend fun getPosts(): Flow<Post> {
        return postsRepository.findAll().asFlow().map(PostEntity::toPost)
    }
}