package com.example.vasiliy.listcourses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 *  Created by vasiliy on 04.05.16.
 */
public class CourseAdapter extends ArrayAdapter<Course> {

    public CourseAdapter(Context context, int resource, ArrayList<Course> objects) {
        super(context, resource, objects);
    }

    public View getView(int position, View view, ViewGroup parent) {

        Course course =getItem(position);

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE );

        View rowView = inflater.inflate(R.layout.activity_layout_item, null, true);

        TextView nameView = (TextView) rowView.findViewById(R.id.nameCourse);
        TextView teacherView = (TextView) rowView.findViewById(R.id.teacherCourse);
        TextView hallView = (TextView) rowView.findViewById(R.id.hallCourse);

        nameView.setText(course.getNameCourse() + " " +course.getTypeCourse());
        teacherView.setText(course.getmTeacherCourse());
        hallView.setText(course.getmLectureHallCours());

        return rowView;
    }
}
