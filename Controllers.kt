package com.application.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.io.File
import java.nio.file.Paths

@RestController class FeatureSwitchController {

    @GetMapping("/features") fun getFeaturesList(): Features {
        val inputStream = File(Paths.get("src/main/resources/feature-file.txt").toUri()).readLines()
        return Features(inputStream)
    }

}