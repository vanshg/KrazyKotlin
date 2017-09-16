package com.vanshgandhi.krazykotlin

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Vansh Gandhi on 8/5/17.
 */

var Date.calendar: Calendar
    get() = Calendar.getInstance().apply { time = this@calendar }
    set(value) {
        time = value.timeInMillis
    }

val Date.isInFuture get() = this > Date()

val Date.isInPast get() = this < Date()

val Date.isToday: Boolean
    get() {
        val calToday = Calendar.getInstance()
        return calToday.get(Calendar.ERA) == calendar.get(Calendar.ERA) &&
                calToday.get(Calendar.YEAR) == calendar.get(Calendar.YEAR) &&
                calToday.get(Calendar.DAY_OF_YEAR) == calendar.get(Calendar.DAY_OF_YEAR)
    }

val Date.isTomorrow: Boolean
    get() {
        val tomorrow = Calendar.getInstance().apply { add(Calendar.DAY_OF_YEAR, 1) }
        return tomorrow.get(Calendar.YEAR) == calendar.get(Calendar.YEAR) &&
                tomorrow.get(Calendar.DAY_OF_YEAR) == calendar.get(Calendar.DAY_OF_YEAR)
    }

val Date.isWeekend: Boolean get() { return day == Calendar.SUNDAY || day == Calendar.SATURDAY }

val Date.isWeekday: Boolean get() { return !isWeekend }

val Date.iso8601: String
    get() {
        val format = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
        format.timeZone = TimeZone.getTimeZone("UTC")
        return format.format(this)
    }

fun Date.roundToMinute() {
    minutes = if (seconds < 30) minutes else (minutes + 1) % 60
    seconds = 0
}

fun Date.roundToFiveMinutes() {
    minutes = if (minutes % 5 < 3) minutes - minutes % 5 else minutes + 5 - minutes % 5
    seconds = 0
}

fun Date.roundToTenMinutes() {
    minutes = if (minutes % 10 < 6) minutes - minutes % 10 else minutes + 10 - minutes % 10
    seconds = 0
}

fun Date.roundToFifteenMinutes() {
    minutes = if (minutes % 15 < 8) minutes - minutes % 15 else minutes + 15 - minutes % 15
    seconds = 0
}

fun Date.roundToHalfHour() {
    minutes = if (minutes % 30 < 15) minutes - minutes % 30 else minutes + 30 - minutes % 30
    seconds = 0
}

fun Date.roundToHour() {
    hours = if (minutes < 30) hours else hours + 1
    minutes = 0
    seconds = 0
}


fun Date.plus(calendarField: Int, amount: Int, modify: Boolean = false): Date {
    // This can't be replaced with the calendar field
    val cal = calendar.apply { add(calendarField, amount) }
    if (modify) { calendar = cal }
    return cal.time
}

fun Date.minus(calendarField: Int, amount: Int, modify: Boolean = false) = plus(calendarField, -amount, modify)
