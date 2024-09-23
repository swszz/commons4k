package org.github.commons4k

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class CollectionExtensionsKtTest {
    data class Book(val author: String, val title: String)

    @Test
    fun filterWithProperty() {
        val books = mutableListOf<Book>().apply {
            this.add(Book(author = "swszz", title = "commons4k"))
            this.add(Book(author = "zzsws", title = "k4snommoc"))
        }

        val filtered = books.filter(Book::author, "swszz")

        assertTrue { filtered.size == 1 }
        assertTrue { filtered.first().title == "commons4k" }
    }
}