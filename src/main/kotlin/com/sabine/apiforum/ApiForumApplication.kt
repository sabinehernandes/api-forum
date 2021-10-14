package com.sabine.apiforum

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class ApiForumApplication

fun main(args: Array<String>) {
	runApplication<ApiForumApplication>(*args)
}
