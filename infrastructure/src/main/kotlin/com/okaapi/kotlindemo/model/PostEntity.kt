package com.okaapi.kotlindemo.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("posts")
class PostEntity(
        var title: String,
        var content: String,
        @Id var id: UUID? = null) {

    suspend fun toPost() = Post(title, content)

}

suspend fun Post.toEntity() = PostEntity(title = title, content = content)