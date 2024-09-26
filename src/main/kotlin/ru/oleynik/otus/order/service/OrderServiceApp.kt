package ru.oleynik.otus.order.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrderServiceApp

fun main(args: Array<String>) {
    runApplication<OrderServiceApp>(*args)
}
