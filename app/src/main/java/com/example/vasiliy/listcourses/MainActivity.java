package com.example.vasiliy.listcourses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Course> chats = new ArrayList<>();
        chats.add(new Course("Русский язык", "ПР", "Русняшка", "В812"));

        CourseAdapter adapter = new CourseAdapter(this, R.id.listView, chats);

        ListView CourseList = (ListView) findViewById(R.id.listView);

        CourseList.setAdapter(adapter);
    }
}
