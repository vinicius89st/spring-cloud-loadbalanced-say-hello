package com.example.demo

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Arrays
import java.util.Random
import java.util.logging.Logger

@RestController
@SpringBootApplication
class SpringCloudLoadbalancerSayHelloApplication

private val log: org.slf4j.Logger? = LoggerFactory.getLogger(SpringCloudLoadbalancerSayHelloApplication::class.java)
fun main(args: Array<String>) {
    runApplication<SpringCloudLoadbalancerSayHelloApplication>(*args)
}

@GetMapping("/greeting")
fun greet(): String? {
    log?.info("Access /greeting")
    val greetings: List<String> = listOf("Hi there", "Greetings", "Salutations")
    val rand = Random()
    val randomNum: Int = rand.nextInt(greetings.size)
    return greetings[randomNum]
}

fun home(): String?{
    log?.info("Access /")
    return "Hi!"
}