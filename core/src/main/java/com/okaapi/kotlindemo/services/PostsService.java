package com.okaapi.kotlindemo.services;

import com.okaapi.kotlindemo.model.Post;
import com.okaapi.kotlindemo.ports.PostsPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    private final PostsPersistencePort postsPersistencePort;

    public PostsService(PostsPersistencePort postsPersistencePort) {
        this.postsPersistencePort = postsPersistencePort;
    }

    public List<Post> getPosts() {
        return postsPersistencePort.getPosts();
    }

}
