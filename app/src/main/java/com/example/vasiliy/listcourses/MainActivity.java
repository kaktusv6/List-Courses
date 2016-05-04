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

        chats.add(new Course("Русский язык", "ПЗ", "Перцева Ксения Адександровна", "D820"));
        chats.add(new Course("Обыкновенные дифференциальные\nуравнения", "ПЗ", "Шепелева Риорита Петровна", "D820"));
        chats.add(new Course("Обыкновенные дифференциальные\nуравнения", "Л", "Шепелева Риорита Петровна", "D738"));
        chats.add(new Course("Вычеслительная математика", "ЛЗ", "Колобоа Александр Георгиевич", "D546а"));
        chats.add(new Course("Элективные курсы по физической культуре\n(Баскетбол)", "ПЗ", "", "S1"));

        chats.add(new Course("Комплексный анализ", "Л", "Дубинин Владимир Николаевич", "D949"));
        chats.add(new Course("Комплексный анализ", "ПЗ", "Дубинин Владимир Николаевич", "D949"));
        chats.add(new Course("Обыкновенные дифференциальные\nуравнения", "ЛЗ", "Клевчихен Юрий Александрович", "D945"));
        chats.add(new Course("Разработка ПО\n(Software Engineering)", "ЛЗ", "Алексанина М.Г.", "D546"));
        chats.add(new Course("Архитектура компьютера", "Л", "Кленин Александр Сергеевич", "D945"));

        chats.add(new Course("Экономика", "Л", "Величко Андрей Сергеевич", "D654/752"));
        chats.add(new Course("Вычислительная математика", "Л", "Пак Татьяна Владимировна", "D738"));
        chats.add(new Course("Теоритичесская механика и физика", "Л", "Мишаков Александр Владиславович", "D548"));
        chats.add(new Course("Теоритичесская механика и физика", "ПЗ", "Мишаков Александр Владиславович", "D548"));

        chats.add(new Course("Архитектура компьютера", "ЛЗ", "Алексанина М.Г.", "D734а"));
        chats.add(new Course("Технология программирования", "Л", "Алексанина М.Г.", "D741"));
        chats.add(new Course("Иностранный язык", "ПЗ", "Веремеева Ирина Феликсовна", "D534"));
        chats.add(new Course("Элективные курсы по физической культуре\n(Баскетбол)", "ПЗ", "", "S1"));

        chats.add(new Course("Экономика", "ПЗ", "Васильева Александра Михайловна", "D945"));
        chats.add(new Course("Компьютерный практикум\nпо программированию", "ЛЗ", "Шепелов М.А.", "D546"));
        chats.add(new Course("Технология программирования", "ЛЗ", "Шепелов М.А.", "D546"));

        CourseAdapter adapter = new CourseAdapter(this, R.id.listView, chats);
        adapter.notifyDataSetChanged();

        ListView courseList = (ListView) findViewById(R.id.listView);
        courseList.setAdapter(adapter);
    }
}
