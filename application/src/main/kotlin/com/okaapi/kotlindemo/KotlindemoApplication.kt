package com.okaapi.kotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class KotlindemoApplication

fun main(args: Array<String>) {
	runApplication<KotlindemoApplication>(*args)
}
