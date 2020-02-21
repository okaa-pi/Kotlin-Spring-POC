package com.okaapi.kotlindemo.repositories

import com.okaapi.kotlindemo.model.PostEntity
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import java.util.*

interface PostsRepository : ReactiveCrudRepository<PostEntity, UUID>