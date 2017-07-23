package com.application.web

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class FeatureSwitchingDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(FeatureSwitchingDemoApplication::class.java, *args)
}
