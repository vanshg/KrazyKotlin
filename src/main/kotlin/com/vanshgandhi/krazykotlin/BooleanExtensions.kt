package com.vanshgandhi.krazykotlin

/**
 * Created by Vansh Gandhi on 6/8/17.
 */

/**
 * Return the int representation of a Boolean: 1 if true, 0 if false
 */
val Boolean.intValue get() = if (this) 1 else 0

/**
 * Returns the toggled value. This function is the same as a not operation
 */
val Boolean.toggled get() = !this