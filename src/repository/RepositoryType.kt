package com.kizito.repository

import com.kizito.model.EmojiPhrase

interface RepositoryType {
    suspend fun add(phrase: EmojiPhrase): EmojiPhrase
    suspend fun phrase(id: Int): EmojiPhrase?
    suspend fun phrase(id: String): EmojiPhrase?
    suspend fun phrases(): List<EmojiPhrase>
    suspend fun remove(phrase: EmojiPhrase)
    suspend fun remove(id: Int): Boolean
    suspend fun remove(id: String): Boolean
    suspend fun  clear()
}