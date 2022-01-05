package com.example.trydependencymanagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TryDependencyManagementApplication

fun main(args: Array<String>) {
    runApplication<TryDependencyManagementApplication>(*args)
}
