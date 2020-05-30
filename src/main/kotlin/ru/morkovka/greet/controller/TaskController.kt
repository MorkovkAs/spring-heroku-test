package ru.morkovka.greet.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hello")
@CrossOrigin
class TaskController() {
    val logger: Logger = LoggerFactory.getLogger(javaClass)

    @GetMapping("/me")
    fun getHelloString(@RequestParam(value = "name", required = true) name: String): String {
        logger.info("Got request getHelloString [name = $name]")
        return "Hello $name"
    }
}