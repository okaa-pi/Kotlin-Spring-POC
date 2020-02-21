package com.okaapi.kotlindemo

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration
import io.r2dbc.postgresql.PostgresqlConnectionFactory
import io.r2dbc.spi.ConnectionFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@Configuration
@EnableR2dbcRepositories
class R2DBCConfiguration(
        @Value("\${spring.datasource.host}")
        val host: String,
        @Value("\${spring.datasource.port}")
        val port: Int,
        @Value("\${spring.datasource.database}")
        val database: String,
        @Value("\${spring.datasource.username}")
        val username: String,
        @Value("\${spring.datasource.password}")
        val password: String) : AbstractR2dbcConfiguration() {


    @Bean
    override fun connectionFactory(): ConnectionFactory {
        return PostgresqlConnectionFactory(
                PostgresqlConnectionConfiguration
                        .builder()
                        .host(host)
                        .port(port)
                        .database(database)
                        .username(username)
                        .password(password)
                        .build())
    }
}