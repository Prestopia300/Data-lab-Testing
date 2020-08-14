/*
package com.example.courseswebservicesapp.model;

import android.os.Build;
import android.util.ArrayMap;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseContent {

    // An array of sample (course) items.

    public static final List<Course> ITEMS = new ArrayList<Course>();

    // A map of sample (course) items, by ID

    public static final Map<String, Course> ITEM_MAP = new HashMap<String, Course>(); // check in run.

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createCourseItem(i));
        }
    }

    private static void addItem(Course item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getCourseId(), item);
    }

    // perhaps change a,b,c,d names to step 7 instructions
    private static Course createCourseItem(int position) {
        return new Course("Id" + position, "Long desc " + position
                , "short desc" + position, "Pre reqs" + position);
    }

    private static String makeDetails(int position) { //changed String and no return to Stringbuilder and return builder. Check in run.
        StringBuilder builder = new StringBuilder();
        builder.append("Details about course: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString(); // I added this, but it wasn't in the instructions
    }


}
*/