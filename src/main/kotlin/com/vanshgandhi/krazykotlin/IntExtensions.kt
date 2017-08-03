package com.vanshgandhi.krazykotlin

import java.util.concurrent.ThreadLocalRandom

/**
 * Created by Vansh Gandhi on 8/2/17.
 * All functions in this class take precedence over any prefix operator (such as negative sign)
 */

/** Returns the absolute value */
val Int.abs get() = Math.abs(this)

/** Returns an array of the digits in the number. If the int is negative, the minus sign is omitted */
val Int.digits get() = toString()
        .filter { it.isDigit() }
        .map { it.toInt() - '0'.toInt() }

/** Returns number of digits in this number */
val Int.numberOfDigits get() = toString().length

/** Returns if the number is even */
val Int.isEven get() = this % 2 == 0

/** Returns if the number is odd */
val Int.isOdd get() = this % 2 != 0

/** Returns if the number is positive */
val Int.isPositive get() = this > 0

/** Returns if the number is negative */
val Int.isNegative get() = this < 0

/** Returns the Roman Numeral representation of this integer. Returns null for non-positive numbers */
val Int.romanNumeral: String? get() {
    var romanValue: String? = null
    val romanValues = listOf(
            Pair("M", 1000),
            Pair("CM", 900),
            Pair("D", 500),
            Pair("CD", 400),
            Pair("C", 100),
            Pair("XC", 90),
            Pair("L", 50),
            Pair("XL", 40),
            Pair("X", 10),
            Pair("IX", 9),
            Pair("V", 5),
            Pair("IV", 4),
            Pair("I", 1)
    )

    // this calculation is only valid for positive numbers
    if (this > 0) {
        romanValue = ""
        var startingValue = this
        romanValues.forEach {
            val (romanChar, arabicValue) = it
            val div = startingValue / arabicValue
            if (div > 0) {
                for (i in 1..div) {
                    romanValue += romanChar
                }
                startingValue -= arabicValue * div
            }
        }
    }
    return romanValue
}
val Int.tenth get() = this / 10
val Int.fourth get() = this / 4
val Int.quarter get() = fourth
val Int.third get() = this / 3
val Int.half get() = this / 2

val Int.doubled get() = this * 2
val Int.tripled get() = this * 3
val Int.quadrupled get() = this * 4

val Int.squared get() = this * this
val Int.cubed get() = this * this * this

val Int.sqrt get() = Math.sqrt(this.toDouble())
val Int.cbrt get() = Math.cbrt(this.toDouble())

/** Returns the GCD of this integer and n */
fun Int.gcd(n: Int): Int {
    return if (n == 0) this else n.gcd(this % n)
}

/** Returns the LCM of this integer and n */
fun Int.lcm(n: Int): Int {
    return (this * n).abs / gcd(n)
}

/** Returns this integer raised to the passed in integer */
infix fun Int.pow(power: Number): Double {
    return Math.pow(this.toDouble(), power.toDouble())
}

/** Returns this integer raised to the passed in integer */
infix fun Int.toThe(power: Number): Double {
    return pow(power)
}

/** Returns the nth root of this integer */
infix fun Int.root(n: Number): Double {
    return pow(1/n.toDouble())
}

/** Return a range, represented as a Pair */
infix fun Int.plusMinus(range: Int): IntRange {
    return IntRange(this - range, this + range)
}

/** Return a range, represented as a Pair */
infix fun Int.`±`(range: Int): IntRange {
    return plusMinus(range)
}

/** Returns a pseudorandom Int value between zero (inclusive) and max (exclusive). */
fun Int.Companion.random(max: Int): Int {
    return ThreadLocalRandom.current().nextInt(max)
}
