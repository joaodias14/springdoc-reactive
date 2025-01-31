package com.example.demo

import org.springframework.web.bind.annotation.*

@RestController
class TestController(
) {
    @GetMapping("/test")
    suspend fun test() = "Test"
}
