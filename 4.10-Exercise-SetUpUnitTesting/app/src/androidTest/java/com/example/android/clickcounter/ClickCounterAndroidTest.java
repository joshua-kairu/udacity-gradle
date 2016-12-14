package com.example.android.clickcounter;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Test class to see if the increments are reflected onscreen
 */
@RunWith( AndroidJUnit4.class )
// When a class is annotated with @RunWith or extends a class annotated with @RunWith,
//  JUnit will invoke the class it references to run the tests in that class
//  instead of the runner built into JUnit.
@LargeTest
// Test size qualifiers are a great way to structure test code
//  and are used to assign a test to a test suite of similar run time.
// Execution time: >1000ms
// Large tests should be focused on testing integration of all application components.
// begin class ClickCounterAndroidTest
public class ClickCounterAndroidTest {

    /* CONSTANTS */
    
    /* VARIABLES */

    /* Activity Test Rules */

    @Rule // Annotates fields that reference rules or methods that return a rule.
    public ActivityTestRule< ClickActivity > mActivityRule =
            new ActivityTestRule< ClickActivity >( ClickActivity.class );

    /* Click Counters */

    private ClickCounter mClickCounter; // ditto

    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */
    
    /* Other Methods */

    @Before // Annotating a public void method with @Before causes that method to be run before the Test method.
    // initClickCounter
    // initializes the counter
    public void initClickCounter() {
        mClickCounter = new ClickCounter();
    }

    @Test // The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case.
    // begin method incrementCounter_sameActivity
    public void incrementCounter_sameActivity() {

        // 0. click the counting button
        // 1. increment the click counter
        // 2. confirm that the text displayed is the same as the increment

        // 0. click the counting button

        onView( withId( R.id.click_button ) ).perform( click() );

        // 1. increment the click counter

        mClickCounter.increment();

        // 2. confirm that the text displayed is the same as the increment

        String currentCount = String.valueOf( mClickCounter.getCount() );

         onView( withId( R.id.click_count_text_view ) )
                 .check( matches( withText( currentCount ) ) );

    } // end method incrementCounter_sameActivity

} // end class ClickCounterAndroidTest
