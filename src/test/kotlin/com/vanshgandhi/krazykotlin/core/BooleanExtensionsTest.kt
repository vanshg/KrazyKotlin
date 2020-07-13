package com.vanshgandhi.krazykotlin.core

import org.junit.Test
import org.junit.Assert.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by Vansh Gandhi on 6/8/17.
 */

class BooleanExtensionsTest {
    @Test fun testIntValue() {
        assertEquals(true.intValue, 1)
        assertEquals(false.intValue, 0)
    }
}
