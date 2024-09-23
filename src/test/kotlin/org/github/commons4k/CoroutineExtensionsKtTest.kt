package org.github.commons4k

import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CoroutineExtensionsKtTest {
    @Test
    fun safeAsync() {
        val default = "default"
        runTest {
            val notThrown = safeAsync({ default }) {
                "not thrown"
            }

            val thrown = safeAsync({ default }) {
                throw IllegalStateException()
            }

            assertEquals(notThrown.await(), "not thrown")
            assertEquals(thrown.await(), default)
        }
    }
}