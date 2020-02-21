package com.okaapi.kotlindemo.repositories

import com.okaapi.kotlindemo.model.PostEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PostsRepository : JpaRepository<PostEntity, UUID>
