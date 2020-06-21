package ch.tinyknightofcoding.example.service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

fun main() {
    SpringApplication.run(DummyServiceApp::class.java)
}

@SpringBootApplication
class DummyServiceApp

@RestController
class EndpointController {

    @GetMapping("guest/hello")
    fun helloGuest() = "Hello, Guest!"

    @GetMapping("admin/hello")
    fun helloAdmin() = "Hello, Admin!"
}
