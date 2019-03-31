package com.clakestudio.pc

import data.DataProvider
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.response.respond
import io.ktor.routing.*
import io.ktor.gson.gson

fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)
    install(ContentNegotiation) {
        gson {
            setPrettyPrinting()
        }
    }
    routing {
        get("/equations") {
            call.respond(DataProvider.equations)
        }
        get("/flashcards") {
            call.respond(DataProvider.flashcards)
        }
    }
}
