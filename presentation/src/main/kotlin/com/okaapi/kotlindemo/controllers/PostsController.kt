package com.okaapi.kotlindemo.controllers

import com.okaapi.kotlindemo.model.Post
import com.okaapi.kotlindemo.model.PostDto
import com.okaapi.kotlindemo.model.toDto
import com.okaapi.kotlindemo.services.PostsService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class PostsController(val postsService: PostsService) {

    @GetMapping("/posts")
    suspend fun getPosts() : Flow<PostDto> {
        return postsService.getPosts().map(Post::toDto)
    }

}