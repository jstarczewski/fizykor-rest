package com.clakestudio.pc

import data.DataProvider
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.response.respond
import io.ktor.routing.*
import io.ktor.gson.gson

/**
 * Entry Point of the application. This function is referenced in the
 * resources/application.conf file inside the ktor.application.modules.
 *
 * For more information about this file: https://ktor.io/servers/configuration.html#hocon-file
 */
fun Application.main() {
    // This adds automatically Date and Server headers to each response, and would allow you to configure
    // additional headers served to each response.
    install(DefaultHeaders)
    // This uses use the logger to log every call (request/response)
    install(CallLogging)
    install(ContentNegotiation) {
        gson {
            setPrettyPrinting()
        }
    }
    routing {
        get("/equations") {
            //call.respond(DataProvider.equations)
            call.respond(DataProvider.equations)
        }
        get("/flashcards") {
            call.respond(DataProvider.flashcards)
        }
    }


}
