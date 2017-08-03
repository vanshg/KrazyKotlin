package com.vanshgandhi.krazykotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Created by Vansh Gandhi on 8/2/17.
 */

class IntExtensionsTest {
    @Test fun testAbs() {
        assertEquals(5, 5.abs)
        assertEquals(5, (-5).abs)
        assertEquals(0, 0.abs)
    }

    @Test fun testDigits() {
        val list1 = 0.digits
        assertEquals(0, list1[0])

        val list2 = (-1).digits
        assertEquals(1, list2[0])

        val list3 = 256.digits
        assertEquals(2, list3[0])
        assertEquals(5, list3[1])
        assertEquals(6, list3[2])
    }

    @Test fun testNumberOfDigits() {
        assertEquals(1, 0.numberOfDigits)
        assertEquals(1, 1.numberOfDigits)
        assertEquals(2, 10.numberOfDigits)
        assertEquals(3, 100.numberOfDigits)
    }

    @Test fun testIsEven() {
        assertTrue(2.isEven)
        assertTrue(0.isEven)
        assertTrue((-2).isEven)
        assertFalse(1.isEven)
        assertFalse((-1).isEven)
    }

    @Test fun testIsOdd() {
        assertFalse(2.isOdd)
        assertFalse(0.isOdd)
        assertFalse((-2).isOdd)
        assertTrue(1.isOdd)
        assertTrue((-1).isOdd)
    }

    @Test fun testIsPositive() {
        assertTrue(1.isPositive)
        assertFalse(0.isPositive)
        assertFalse((-1).isPositive)
    }

    @Test fun testIsNegative() {
        assertTrue((-1).isNegative)
        assertFalse(0.isNegative)
        assertFalse(1.isNegative)
    }

    @Test fun testRomanNumeral() {
        assertNull((-1).romanNumeral)
        assertNull(0.romanNumeral)
        assertEquals("X", 10.romanNumeral)
        assertEquals("MCXI", 1111.romanNumeral)
    }

    @Test fun testTenth() {
        assertEquals(1, 10.tenth)
    }

    @Test fun testFourth() {
        assertEquals(1, 4.fourth)
        assertEquals(1, 4.quarter)
    }

    @Test fun testThird() {
        assertEquals(1, 3.third)
    }

    @Test fun testHalf() {
        assertEquals(1, 2.half)
    }

    @Test fun testDouble() {
        assertEquals(2, 1.doubled)
    }

    @Test fun testTriple() {
        assertEquals(3, 1.tripled)
    }

    @Test fun testQuadruple() {
        assertEquals(4, 1.quadrupled)
    }

    @Test fun testSquared() {
        assertEquals(1, 1.squared)
        assertEquals(1, (-1).squared)
        assertEquals(0, 0.squared)
        assertEquals(4, 2.squared)
        assertEquals(9, 3.squared)
    }

    @Test fun testCubed() {
        assertEquals(-1, (-1).cubed)
        assertEquals(27, 3.cubed)
    }

    @Test fun testSqrt() {
        assertEquals(0.toDouble(), 0.sqrt)
        assertEquals(1.toDouble(), 1.sqrt)
        assertEquals(2.toDouble(), 4.sqrt)
    }

    @Test fun testCbrt() {
        assertEquals(0.toDouble(), 0.cbrt)
        assertEquals(3.toDouble(), 27.cbrt)
    }

    @Test fun testGcd() {
        assertEquals(4, 8.gcd(20))
    }

    @Test fun testLcm() {
        assertEquals(12, 4.lcm(3))
    }

    @Test fun testPow() {
        assertEquals(9.toDouble(), 3 toThe 2)
        assertEquals(27.toDouble(), 3 pow 3)
    }

    @Test fun testRoot() {
        assertEquals(3.toDouble(), 9 root 2)
        assertEquals(3.toDouble(), 27 root 3)
    }

    @Test fun testPlusMinus() {
        val range = 5 `±` 3
        assertEquals(2, range.first)
        assertEquals(8, range.last)
    }
}
