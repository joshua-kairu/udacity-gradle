package com.example.android.clickcounter;

import android.util.Log;

import org.junit.Test;

// begin class ClickCounterTest
public class ClickCounterTest {

    /* CONSTANTS */

    /* VARIABLES */

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    // 1. Set up unit tests that verify the initial count
    // and increment methods of the ClickCounter class

    @Test
    // begin method verifyInitialCount
    public void verifyInitialCount() {

        // 0. create a new click counter
        // 1. verify that the new counter's initial count is zero

        // 0. create a new click counter

        ClickCounter clickCounter = new ClickCounter();

        // 1. verify that the new counter's initial count is zero

        assert clickCounter.getCount() == 0;

    } // end method verifyInitialCount

    @Test
    // begin method verifyIncrement
    public void verifyIncrement() {

        // 0. create a new click counter
        // 1. get the initial count
        // 2. increment the count of the click counter
        // 3. verify that the incremented count is greater than the initial by one

        // 0. create a new click counter

        ClickCounter clickCounter = new ClickCounter();

        // 1. get the initial count

        int initialCount = clickCounter.getCount();

        // 2. increment the count of the click counter

        clickCounter.increment();

        // 3. verify that the incremented count is greater than the initial by one

        int currentCount = clickCounter.getCount();

        int difference = currentCount - initialCount;

        assert difference == 1;

    } // end method verifyIncrement

    /* Other Methods */

} // end class ClickCounterTest
