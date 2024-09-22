package org.github.commons4k

import com.google.gson.Gson
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class JsonExtensionsKtTest {

    @Test
    fun stringToJsonTest() {
        val author = "swszz"
        val title = "commons4k"
        val json = " { \"author\" : \"$author\", \"title\" : \"$title\" } "

        val book = Gson().fromJson<Book>(json = json)

        assertEquals(author, book.author)
        assertEquals(title, book.title)
    }

    data class Book(
        val author: String,
        val title: String,
    )
}