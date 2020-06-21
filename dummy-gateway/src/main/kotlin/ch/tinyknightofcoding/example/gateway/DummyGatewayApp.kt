package ch.tinyknightofcoding.example.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

fun main() {
    SpringApplication.run(DummyGatewayApp::class.java)
}

@SpringBootApplication
class DummyGatewayApp

@Configuration
class SecurityConfig {

    @Bean
    fun myFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain =
        http
            .authorizeExchange()
            .pathMatchers("/admin/**").authenticated()
            .pathMatchers("/guest/**").permitAll()
            .anyExchange().denyAll()
            .and()
            .build()
}
