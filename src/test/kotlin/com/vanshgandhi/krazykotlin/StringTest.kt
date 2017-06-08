package com.vanshgandhi.krazykotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Created by Vansh Gandhi on 6/7/17.
 */

class StringTest {

    @Test fun testBase64Decode() {
        assertEquals("SGVsbG8gV29ybGQh".base64Decoded, "Hello World!")
        assertNull("hello".base64Decoded)
    }

    @Test fun testBase64Encode() {
        assertEquals("Hello World!".base64Encoded, "SGVsbG8gV29ybGQh")
    }

    @Test fun testCamelCased() {
        assertEquals("Hello world".camelCased, "helloWorld")
        assertEquals("Helloworld\t".camelCased, "helloworld")
    }

    @Test fun testContainsLetters() {
        assertTrue("1 Hello, World!".containsLetters)
        assertFalse("123".containsLetters)
    }

    @Test fun testContainsNumbers() {
        assertTrue("A 123".containsNumbers)
        assertFalse("Hello, World!".containsNumbers)
    }

    @Test fun testIsAlphanumeric() {
        assertTrue("ABC123".isAlphanumeric)
        assertTrue("".isAlphanumeric)
        assertTrue("abc".isAlphanumeric)
        assertTrue("123".isAlphanumeric)
        assertFalse("abc 123".isAlphanumeric)
        assertFalse("123!".isAlphanumeric)
    }

    @Test fun testIsAlphabetic() {
        assertTrue("abcXYZ".isAlphabetic)
        assertTrue("".isAlphabetic)
        assertFalse("ABC123".isAlphabetic)
        assertFalse("abc ".isAlphabetic)
        assertFalse("123".isAlphabetic)
        assertFalse("abc!".isAlphabetic)
    }

    @Test fun testIsNumeric() {
        assertTrue("123".isNumeric)
        assertTrue("".isNumeric)
        assertFalse("abcXYZ".isNumeric)
        assertFalse("ABC123".isNumeric)
        assertFalse("123 ".isNumeric)
        assertFalse("123!".isNumeric)
    }

    @Test fun testIsEmail() {
        assertTrue("vansh.gandhi@gmail.com".isEmail)
        assertFalse("vansh.gandhigmail.com".isEmail)
        assertFalse("vansh.gandhi@gmailcom".isEmail)
        assertFalse("".isEmail)
    }

    @Test fun testIsUrl() {
        assertTrue("http://van.sh".isUrl)
        assertTrue("https://van.sh".isUrl)
        assertTrue("https://www.van.sh".isUrl)
        assertTrue("http://van.sh/resume.pdf".isUrl)
        assertTrue("file://test1/test2/file.txt".isUrl)
        assertFalse("Hello, world".isUrl)
        assertFalse("".isUrl)
    }

    @Test fun testMostCommon() {
        assertEquals("Vansh Gandhi reeeeeeeeeeeeeeeeeeeeeeeeeeeeee".mostCommonCharacter, 'e')
        assertEquals("abbbaa".mostCommonCharacter, 'a')
        assertNull("".mostCommonCharacter)
    }
}