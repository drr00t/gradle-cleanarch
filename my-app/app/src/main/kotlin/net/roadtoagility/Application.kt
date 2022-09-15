package net.roadtoagility

import io.ktor.server.application.*
import net.roadtoagility.plugins.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureRouting()
    configureSerialization()
}