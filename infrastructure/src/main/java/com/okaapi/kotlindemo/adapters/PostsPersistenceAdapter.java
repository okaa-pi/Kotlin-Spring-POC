package com.okaapi.kotlindemo.adapters;

import com.okaapi.kotlindemo.model.Post;
import com.okaapi.kotlindemo.ports.PostsPersistencePort;
import com.okaapi.kotlindemo.repositories.PostsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostsPersistenceAdapter implements PostsPersistencePort {

    private final PostsRepository postsRepository;

    public PostsPersistenceAdapter(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    @Override
    public List<Post> getPosts() {
        return postsRepository.findAll()
                .stream()
                .map(postEntity -> new Post(postEntity.getTitle(), postEntity.getContent()))
                .collect(Collectors.toList());
    }
}
