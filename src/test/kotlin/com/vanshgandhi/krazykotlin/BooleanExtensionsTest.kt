package com.vanshgandhi.krazykotlin

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

    @Test fun testToggled() {
//        assertFalse(true.toggled)
//        assertTrue(false.toggled)
    }
}
