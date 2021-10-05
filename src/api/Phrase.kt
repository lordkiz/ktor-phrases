package com.kizito.api

import com.kizito.API_VERSION
import com.kizito.model.EmojiPhrase
import com.kizito.model.Request
import com.kizito.redirect
import com.kizito.repository.InMemoryRepository
import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

const val PHRASE_ENDPOINT = "$API_VERSION/phrase"
@Location(PHRASE_ENDPOINT)
class Phrases

fun Route.phrase(db: InMemoryRepository) {
    post<Phrases> {
        val request = call.receive<Request>()
        val phrase = db.add(EmojiPhrase(request.emoji, request.phrase))
        call.redirect(Phrases())
    }
}



