package com.example.courseswebservicesapp;

import android.app.Activity;
import android.os.Bundle;

import com.example.courseswebservicesapp.model.Course;
//import com.example.courseswebservicesapp.model.CourseContent;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link CourseListActivity}
 * in two-pane mode (on tablets) or a {@link CourseDetailActivity}
 * on handsets.
 */
public class CourseDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private Course mCourse;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public CourseDetailFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mCourse = (Course) getArguments().getSerializable(ARG_ITEM_ID);

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout)
                    activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mCourse.getCourseId());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.course_detail, container, false); // was course_detail. was R.layout

        // Show the dummy content as text in a TextView.
        if (mCourse != null) {
            ((TextView) rootView.findViewById(R.id.item_detail_id)).setText(
                    mCourse.getCourseId());
            ((TextView) rootView.findViewById(R.id.item_detail_short_desc)).setText(
                    mCourse.getCourseShortDesc());
            ((TextView) rootView.findViewById(R.id.item_detail_long_desc)).setText(
                    mCourse.getCourseLongDesc());
            ((TextView) rootView.findViewById(R.id.item_detail_prereqs)).setText(
                    mCourse.getCoursePrereqs());
        }

        return rootView;
    }
}