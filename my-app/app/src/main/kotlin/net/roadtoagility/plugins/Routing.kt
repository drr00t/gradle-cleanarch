package net.roadtoagility.plugins

import net.roadtoagility.routes.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        productsRouting()
    }
}