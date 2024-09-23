package org.github.commons4k

import kotlin.reflect.KProperty1

fun <T, R : Any> List<T>.filter(property: KProperty1<T, R>, value: R): List<T> {
    return this.filter { item -> property.get(item) == value }
}