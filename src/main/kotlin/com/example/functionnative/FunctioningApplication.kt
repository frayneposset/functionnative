package com.example.functionnative

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class FunctioningApplication {
	@Bean
	fun toUpperCase(): (String) -> String = { it.toUpperCase() }
}


fun main(args: Array<String>) {
	runApplication<FunctioningApplication>(*args)
}



