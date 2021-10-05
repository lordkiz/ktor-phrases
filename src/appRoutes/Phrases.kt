package com.kizito.appRoutes

import com.kizito.repository.InMemoryRepository
import io.ktor.application.*
import io.ktor.freemarker.*
import io.ktor.locations.*
import io.ktor.response.*
import io.ktor.routing.*

const val PHRASES = "/phrases"
@Location(PHRASES)
class Phrases

fun Route.phases(db: InMemoryRepository) {
    get<Phrases> {
        val phrases = db.phrases()
        call.respond(FreeMarkerContent("phrases.ftl", mapOf("phrases" to phrases)))
    }
}