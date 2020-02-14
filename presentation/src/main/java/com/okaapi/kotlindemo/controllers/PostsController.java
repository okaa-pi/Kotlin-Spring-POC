package com.okaapi.kotlindemo.controllers;

import com.okaapi.kotlindemo.model.PostDto;
import com.okaapi.kotlindemo.services.PostsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PostsController {

    private final PostsService postsService;

    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }

    @GetMapping("/posts")
    public List<PostDto> getPosts() {
        return postsService.getPosts()
                .stream()
                .map(post -> new PostDto(post.getTitle(), post.getContent()))
                .collect(Collectors.toList());
    }
}
