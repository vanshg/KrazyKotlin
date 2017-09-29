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

    @Test fun testCalendar() {
        val time = System.currentTimeMillis() + 4838 // arbitrary
        val date = Date(time)
        assertEquals(date.calendar.timeInMillis, time)
        val time2 = System.currentTimeMillis() + 9294 // arbitrary
        val cal = Calendar.getInstance().apply { timeInMillis }
        date.calendar = cal
        assertEquals(cal.timeInMillis, date.time)
    }

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

    @Test fun testIsTomorrow() {
        assertTrue(Date(System.currentTimeMillis() + 8.64E7.toLong()).isTomorrow)
        assertFalse(Date().isTomorrow)
    }

    @Test fun testIsWeekend() {
        val weekday = Date(2017, 9, 29)
        val weekend = Date(2017, 9, 30)
        assertTrue(weekend.isWeekend)
        assertFalse(weekday.isWeekend)
    }

    @Test fun testIsWeekday() {
        val weekday = Date(2017, 9, 29)
        val weekend = Date(2017, 9, 30)
        assertFalse(weekend.isWeekday)
        assertTrue(weekday.isWeekday)
    }

    @Test fun testIso8601() {
        val date = Date(1506705711)
        assertEquals("1970-01-18T10:31:45.711Z", date.iso8601)
    }

    @Test fun roundToMinute() {
        val date = Date(2017, 9, 30, 1, 25, 37)
        val date2 = Date(2017, 9, 30, 1, 25, 28)
        date.roundToMinute()
        date2.roundToMinute()
        assertEquals(date.minutes, 26)
        assertEquals(date.seconds, 0)
        assertEquals(date2.minutes, 25)
        assertEquals(date2.seconds, 0)
    }

    @Test fun roundToFiveMinutes() {
        val date = Date(2017, 9, 30, 1, 25, 37)
        val date2 = Date(2017, 9, 30, 1, 24, 28)
        val date3 = Date(2017, 9, 30, 1, 22, 28)
        date.roundToFiveMinutes()
        date2.roundToFiveMinutes()
        date3.roundToFiveMinutes()
        assertEquals(date.minutes, 25)
        assertEquals(date.seconds, 0)
        assertEquals(date2.minutes, 25)
        assertEquals(date2.seconds, 0)
        assertEquals(date3.minutes, 20)
        assertEquals(date3.seconds, 0)
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
