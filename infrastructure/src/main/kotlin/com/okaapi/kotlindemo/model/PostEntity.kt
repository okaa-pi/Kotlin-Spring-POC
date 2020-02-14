package com.okaapi.kotlindemo.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "posts")
class PostEntity(
        var title: String,
        var content: String,
        @Id @GeneratedValue var id: UUID? = null) {

    fun toPost() = Post(title, content)

}

fun Post.toEntity() = PostEntity(title = title, content = content)