package com.example.courseswebservicesapp;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class CourseListActivityTest {

    @Rule
    public ActivityTestRule<CourseListActivity> mActivityRule = new ActivityTestRule<>(
            CourseListActivity.class);


    @Test
    public void displaysRecyclerView() {
        // First, scroll to the position that needs to be matched and click on it.
        onView(withId(R.id.item_list))
                .perform(RecyclerViewActions.actionOnItemAtPosition(0,
        click()));

        // Match the text in an item below the fold and check that it's displayed.
        String itemElementText = "TCSS 422";
        onView(withText(itemElementText)).check(matches(isDisplayed()));
    }

    @Test
    public void floatingActionButtonWorks() {
        onView(withId(R.id.fab))
                .perform(click());
        onView(withText("ADD COURSE"))
                .check(matches(isDisplayed()));
    }
// both tests run, but fail when they try to interact with the ghost list of objects
}
