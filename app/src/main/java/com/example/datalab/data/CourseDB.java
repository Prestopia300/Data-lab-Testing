/*  This was supposed to be in Web Services Lab, oops
package com.example.datalab.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.datalab.R;

public class CourseDB {
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "Course.db";

    private CourseDBHelper mCourseDBHelper;
    private SQLiteDatabase mSQLiteDatabase;

    class CourseDBHelper extends SQLiteOpenHelper {

        private final String CREATE_COURSE_SQL;

        private final String DROP_COURSE_SQL;

        public CourseDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int
                version) {
            super(context, name, factory, version);
            CREATE_COURSE_SQL = context.getString(R.string.CREATE_COURSE_SQL);
            DROP_COURSE_SQL = context.getString(R.string.DROP_COURSE_SQL);

        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(CREATE_COURSE_SQL);
        }
        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL(DROP_COURSE_SQL);
            onCreate(sqLiteDatabase);
        }
    }

    //does constructur go inside or outside of a class?
    //This is inside CourseDB, but outside CourseDBHelper
    public CourseDB(Context context) {
        mCourseDBHelper = new CourseDBHelper(
                context, DB_NAME, null, DB_VERSION);
        mSQLiteDatabase = mCourseDBHelper.getWritableDatabase();
    }

    */
/**
     * Inserts the course into the local sqlite table. Returns true if successful, false otherwise.
     * @param id
     * @param shortDesc
     * @param longDesc
     * @param prereqs
     * @return true or false
     *//*

    public boolean insertCourse(String id, String shortDesc, String longDesc, String prereqs) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", id);
        contentValues.put("shortDesc", shortDesc);
        contentValues.put("longDesc", longDesc);
        contentValues.put("prereqs", prereqs);
        long rowId = mSQLiteDatabase.insert("Course", null, contentValues);
        return rowId != -1;
    }

    */
/**
     * * Delete all the data from the Courses
     * *//*

    public void deleteCourses() {
        mSQLiteDatabase.delete("Course", null, null);
    }

    */
/**
    * Returns the list of courses from the local Course table. * @return list
    *//*

    public List<Course> getCourses()
    {
        String[] columns = {
                "id", "shortDesc", "longDesc", "prereqs"
        };
        Cursor c = mSQLiteDatabase.query(
                "Course",  // The table to query
                columns,                               // The columns to return
                null,                                // The columns for the WHERE clause            \
                null,                            // The values for the WHERE clause
                null,                                     // don't group the rows
                null,                                     // don't filter by row groups
                null                                 // The sort order
                );
        c.moveToFirst();
        List<Course> list = new ArrayList<Course>();
        for (int i=0; i<c.getCount(); i++) {
            String id = c.getString(0);
            String shortDesc = c.getString(1);
            String longDesc = c.getString(2);
            String prereqs = c.getString(3);
            Course course = new Course(id, shortDesc, longDesc, prereqs);
            list.add(course);
            c.moveToNext();
        }

        return list;}
    }



}//theres a problem with the brackets. coppied wrong, or in wrong place?
*/
