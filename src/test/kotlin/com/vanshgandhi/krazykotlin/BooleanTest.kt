package com.vanshgandhi.krazykotlin

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Vansh Gandhi on 6/8/17.
 */

class BooleanTest {
    @Test fun testIntValue() {
        assertEquals(true.intValue, 1)
        assertEquals(false.intValue, 0)
    }
}