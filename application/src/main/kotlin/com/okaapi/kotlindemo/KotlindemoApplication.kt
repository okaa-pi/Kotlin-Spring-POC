package com.okaapi.kotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
class KotlindemoApplication

fun main(args: Array<String>) {
	runApplication<KotlindemoApplication>(*args)
}
