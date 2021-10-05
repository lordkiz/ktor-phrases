package com.kizito.appRoutes

import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.response.*
import io.ktor.routing.*

const val HOME = "/"
@Location(HOME)
class Home

fun Route.home() {
    get<Home> {
        call.respondText("Welcome to EmojiPhrases")
    }
}