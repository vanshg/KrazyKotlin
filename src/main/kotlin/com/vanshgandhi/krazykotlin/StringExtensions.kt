package com.vanshgandhi.krazykotlin

import java.net.MalformedURLException
import java.net.URL
import java.nio.charset.Charset
import java.util.*

/**
 * Created by Vansh Gandhi on 6/7/17.
 */

/**
 * Using UTF-8 encoding
 */
fun String.base64Decoded() = try {
    String(Base64.getDecoder().decode(toByteArray()))
} catch (e: IllegalArgumentException) {
    null
}

/**
 * Using UTF-8 encoding
 */
fun String.base64Encoded() = Base64.getEncoder().encodeToString(toByteArray())

/**
 * Splits by spaces, newlines, and tabs only
 */
fun String.camelCased(): String {
    val split = toLowerCase().split(' ', '\n', '\t').toMutableList()
    if (split.size > 1) {
        for (i in 1..split.size - 1) {
            if (split[i].length > 1) {
                val charArray = split[i].toCharArray()
                charArray[0] = charArray[0].toUpperCase()
                split[i] = String(charArray)
            }
        }
    }
    return split.joinToString("")
}

fun String.containsLetters() = matches(".*[a-zA-Z].*".toRegex())

fun String.containsNumbers() = matches(".*[0-9].*".toRegex())

/**
 * Does not allow whitespace or symbols
 * Allows empty string
 */
fun String.isAlphanumeric() = matches("^[a-zA-Z0-9]*$".toRegex())

/**
 * Does not allow whitespace or symbols
 * Allows empty string
 */
fun String.isAlphabetic() = matches("^[a-zA-Z]*$".toRegex())

/**
 * Does not allow whitespace or symbols
 * Allows empty string
 */
fun String.isNumeric() = matches("^[0-9]*$".toRegex())

fun String.isEmail() = matches("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}".toRegex())

/**
 * Only matches URLs starting with a scheme (e.g. http://, file://, ftp://, etc)
 */
fun String.isUrl() = try {
    URL(this) != null
} catch (e: MalformedURLException) {
    false
}