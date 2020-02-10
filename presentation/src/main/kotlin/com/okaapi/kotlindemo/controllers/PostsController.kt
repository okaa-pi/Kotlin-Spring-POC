package com.okaapi.kotlindemo.controllers

import com.okaapi.kotlindemo.model.Post
import com.okaapi.kotlindemo.model.PostDto
import com.okaapi.kotlindemo.model.toDto
import com.okaapi.kotlindemo.services.PostsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors

@RestController
class PostsController(val postsService: PostsService) {

    @GetMapping("/posts")
    fun getPosts() : List<PostDto> {
        return postsService.getPosts().map(Post::toDto)
    }

}