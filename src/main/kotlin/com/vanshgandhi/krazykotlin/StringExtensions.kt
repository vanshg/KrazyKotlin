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
val String.base64Decoded get() = try {
    String(Base64.getDecoder().decode(toByteArray()))
} catch (e: IllegalArgumentException) {
    null
}

/**
 * Using UTF-8 encoding
 */
val String.base64Encoded: String get() = Base64.getEncoder().encodeToString(toByteArray())

/**
 * Splits by spaces, newlines, and tabs only
 */
val String.camelCased: String
    get() {
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

val String.containsLetters get() = matches(".*[a-zA-Z].*".toRegex())

val String.containsNumbers get() = matches(".*[0-9].*".toRegex())

/**
 * Does not allow whitespace or symbols
 * Allows empty string
 */
val String.isAlphanumeric get() = matches("^[a-zA-Z0-9]*$".toRegex())

/**
 * Does not allow whitespace or symbols
 * Allows empty string
 */
val String.isAlphabetic get() = matches("^[a-zA-Z]*$".toRegex())

/**
 * Does not allow whitespace or symbols
 * Allows empty string
 */
val String.isNumeric get() = matches("^[0-9]*$".toRegex())

val String.isEmail get() = matches("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}".toRegex())

/**
 * Only matches URLs starting with a scheme (e.g. http://, file://, ftp://, etc)
 */
val String.isUrl get() = try {
    URL(this) != null
} catch (e: MalformedURLException) {
    false
}

/**
 * If there is more than one most common character, this returns the character that occurred first in the String
 */
val String.mostCommonCharacter: Char? get() {
    if (length == 0) return null
    val map = HashMap<Char, Int>()
    for (char in toCharArray()) map.put(char, (map[char] ?: 0) + 1)
    var maxEntry = map.entries.elementAt(0)
    for (entry in map) maxEntry = if (entry.value > maxEntry.value) entry else maxEntry
    return maxEntry.key
}