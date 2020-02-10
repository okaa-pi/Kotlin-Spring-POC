package com.okaapi.kotlindemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class PostEntity(
        @Id @GeneratedValue var id: Long?,
        var title: String,
        var content: String) {

    fun toPost() = Post(title, content)

}