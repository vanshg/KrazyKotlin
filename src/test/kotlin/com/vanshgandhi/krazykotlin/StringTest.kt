package com.vanshgandhi.krazykotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * Created by Vansh Gandhi on 6/7/17.
 */

class StringTest {

    @Test fun testBase64Decode() {
        assertEquals("SGVsbG8gV29ybGQh".base64Decoded(), "Hello World!")
        assertNull("hello".base64Decoded())
    }

    @Test fun testBase64Encode() {
        assertEquals("Hello World!".base64Encoded(), "SGVsbG8gV29ybGQh")
    }

    @Test fun testCamelCased() {
        assertEquals("Hello world".camelCased(), "helloWorld")
        assertEquals("Helloworld\t".camelCased(), "helloworld")
    }

}