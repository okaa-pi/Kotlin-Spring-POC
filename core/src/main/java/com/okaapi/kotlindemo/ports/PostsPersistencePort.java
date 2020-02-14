package com.okaapi.kotlindemo.ports;

import com.okaapi.kotlindemo.model.Post;

import java.util.List;

public interface PostsPersistencePort {
    List<Post> getPosts();
}
