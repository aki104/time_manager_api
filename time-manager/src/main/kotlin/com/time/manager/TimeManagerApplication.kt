package com.time.manager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
@SpringBootApplication
class TimeManagerApplication

fun main(args: Array<String>) {
	runApplication<TimeManagerApplication>(*args)
}
