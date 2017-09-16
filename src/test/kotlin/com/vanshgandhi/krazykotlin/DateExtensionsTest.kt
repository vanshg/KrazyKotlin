package com.vanshgandhi.krazykotlin

import org.junit.Test
import java.time.DayOfWeek
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by Vansh Gandhi on 9/14/17.
 */

class DateExtensionsTest {
    @Test fun testIsInFuture() {
        assertTrue(Date(System.currentTimeMillis() + 100000).isInFuture)
        assertFalse(Date().isInFuture)
        assertFalse(Date(System.currentTimeMillis() - 100000).isInFuture)
    }

    @Test fun testIsInPast() {
        assertTrue(Date(System.currentTimeMillis() - 100000).isInPast)
        assertFalse(Date().isInPast)
        assertFalse(Date(System.currentTimeMillis() + 100000).isInPast)
    }

    @Test fun testIsToday() {
        assertFalse(Date(System.currentTimeMillis() + 8.64E7.toLong()).isToday)
        assertTrue(Date().isToday)
    }

    @Test fun testPlus() {
        val today = Date()
        val tomorrow = Date(System.currentTimeMillis() + 8.64E7.toLong())
        assertEquals(today.plus(Calendar.DAY_OF_MONTH, 1), tomorrow)
    }

    @Test fun testMinus() {
        val today = Date()
        val tomorrow = Date(System.currentTimeMillis() + 8.64E7.toLong())
        assertEquals(tomorrow.minus(Calendar.DAY_OF_MONTH, 1), today)
    }
}
