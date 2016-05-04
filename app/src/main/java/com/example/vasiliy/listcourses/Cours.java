package com.example.vasiliy.listcourses;

/**
 * Created by vasiliy on 04.05.16.
 */
public class Cours {
    private String mNameCourse = "";
    private String mTypeCourse = "";
    private String mTeacherCourse = "";
    private String mLectureHallCourse = "";

    public Cours(   String nameCourse, String typeCourse,
                    String teacherCourse, String lectureHallCourse)
    {
        this.mNameCourse = nameCourse;
        this.mTypeCourse = typeCourse;
        this.mTeacherCourse = teacherCourse;
        this.mLectureHallCourse = lectureHallCourse;
    }


}
