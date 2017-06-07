package com.vanshgandhi.krazykotlin

import java.util.*

/**
 * Created by Vansh Gandhi on 6/7/17.
 */

fun String.base64Decoded() : String? {
    return try {String(Base64.getDecoder().decode(this))} catch (e: Exception) {null}
}

fun String.base64Encoded() : String {
    return Base64.getEncoder().encodeToString(toByteArray())
}

fun String.camelCased() : String {
    
}