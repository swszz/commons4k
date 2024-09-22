package org.github.commons4k

import com.google.gson.Gson

/**
 * string to json without reflection
 */
inline fun <reified T> Gson.fromJson(json: String): T = this.fromJson(json, T::class.java)