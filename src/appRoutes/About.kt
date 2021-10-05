package com.kizito.appRoutes

import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.response.*
import io.ktor.routing.*

const val ABOUT = "/about"
@Location(ABOUT)
class About

fun Route.about() {
    get<About> {
        call.respondText { "This is about us" }
    }
}