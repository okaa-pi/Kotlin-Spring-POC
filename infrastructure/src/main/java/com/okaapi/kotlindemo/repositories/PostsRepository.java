package com.okaapi.kotlindemo.repositories;

import com.okaapi.kotlindemo.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostsRepository extends JpaRepository<PostEntity, UUID> {
}
