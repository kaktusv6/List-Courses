package com.example.vasiliy.listcourses;

/**
 * Created by vasiliy on 04.05.16.
 */
public class Cours {
    private String mNameCourse = "";
    private String mTypeCourse = "";
    private String mTeacherCourse = "";
    private String mLectureHallCourse = "";

    /* ---------- Constructor ---------- */
    public Cours(   String nameCourse, String typeCourse,
                    String teacherCourse, String lectureHallCourse)
    {
        mNameCourse = nameCourse;
        mTypeCourse = typeCourse;
        mTeacherCourse = teacherCourse;
        mLectureHallCourse = lectureHallCourse;
    }

    /* ---------- get methods ---------- */

    public String getNameCourse(){
        return mNameCourse;
    }
    public String getTypeCourse(){
        return mTypeCourse;
    }
    public String getmTeacherCourse(){
        return mTeacherCourse;
    }
    public String getmLectureHallCours(){
        return mLectureHallCourse;
    }
}
