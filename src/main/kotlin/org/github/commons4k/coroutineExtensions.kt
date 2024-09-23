package org.github.commons4k

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async

fun <T> CoroutineScope.safeAsync(
    default: (() -> T)? = null,
    block: suspend CoroutineScope.() -> T,
): Deferred<T> {
    return async {
        runCatching {
            block()
        }.getOrElse {
            default?.invoke() ?: throw it
        }
    }
}