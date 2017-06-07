package com.vanshgandhi.krazykotlin

import java.util.*

/**
 * Created by Vansh Gandhi on 6/7/17.
 */

/**
 * Using UTF-8 encoding
 */
fun String.base64Decoded() : String? {
    return try {String(Base64.getDecoder().decode(toByteArray()))} catch (e: Exception) {null}
}

/**
 * Using UTF-8 encoding
 */
fun String.base64Encoded() : String {
    return Base64.getEncoder().encodeToString(toByteArray())
}

/**
 * Splits by spaces, newlines, and tabs only
 */
fun String.camelCased() : String {
    val split = toLowerCase().split(' ', '\n', '\t').toMutableList()
    if (split.size > 1) {
        for (i in 1 .. split.size-1) {
            if (split[i].length > 1) {
                val charArray = split[i].toCharArray()
                charArray[0] = charArray[0].toUpperCase()
                split[i] = String(charArray)
            }
        }
    }
    return split.joinToString("")
}

