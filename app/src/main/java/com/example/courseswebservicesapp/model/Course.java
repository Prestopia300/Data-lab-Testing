package com.example.courseswebservicesapp.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {

    private String mCourseId;
    private String mCourseShortDesc;
    private String mCourseLongDesc;
    private String mCoursePrereqs;

    public static final String ID = "id";
    public static final String SHORT_DESC = "shortdesc";
    public static final String LONG_DESC = "longdesc";
    public static final String PRE_REQS = "prereqs";


    // constructor

    public Course(String mCourseId, String mCourseLongDesc, String mCourseShortDesc
            , String mCoursePrereqs) {
    }

    // getters

    public String getCourseId() {
        return mCourseId;
    }

    public String getCourseShortDesc() {
        return mCourseShortDesc;
    }

    public String getCourseLongDesc() {
        return mCourseLongDesc;
    }

    public String getCoursePrereqs() {
        return mCoursePrereqs;
    }

    // setters

    public void setCourseId(String mCourseId) {
        this.mCourseId = mCourseId;
    }

    public void setCourseShortDesc(String mCourseShortDesc) {
        this.mCourseShortDesc = mCourseShortDesc;
    }

    public void setCourseLongDEsc(String mCourseLongDesc) { // changed Desc to DEsc, probably undo
        this.mCourseLongDesc = mCourseLongDesc;
    }

    public void setCoursePrereqs(String mCoursePrereqs) {
        this.mCoursePrereqs = mCoursePrereqs;
    }

    public static List<Course> parseCourseJson(String courseJson) throws JSONException {
        List<Course> courseList = new ArrayList<>();
        if (courseJson != null) {
            JSONArray arr = new JSONArray(courseJson);

            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);
                Course course = new Course(obj.getString(Course.ID), obj.getString(Course.SHORT_DESC)
                        , obj.getString(Course.LONG_DESC), obj.getString(Course.PRE_REQS));
                courseList.add(course);
            }

        }

        return courseList;

    }
}
