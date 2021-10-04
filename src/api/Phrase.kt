package com.kizito.api

import com.kizito.API_VERSION
import com.kizito.model.EmojiPhrase
import com.kizito.model.Request
import com.kizito.repository.InMemoryRepository
import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

const val PHRASE_ENDPOINT = "$API_VERSION/phrase"

fun Route.phrase(db: InMemoryRepository) {
    post(PHRASE_ENDPOINT) {
        val request = call.receive<Request>()
        val phrase = db.add(EmojiPhrase(request.emoji, request.phrase))
        call.respond(phrase)
    }
}



