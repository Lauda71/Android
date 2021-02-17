package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HelpActivity extends AppCompatActivity {

    ExpandableListViewAdapter listViewAdapter;
    ExpandableListView expandableListView;
    List<String> chapterList;
    HashMap<String, List<String>> topicList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        expandableListView = findViewById(R.id.expListView);

        showList();

        listViewAdapter = new ExpandableListViewAdapter(this, chapterList, topicList);
        expandableListView.setAdapter(listViewAdapter);

        Button button_contact = (Button) findViewById(R.id.button_contact);
        Button button_back = (Button) findViewById(R.id.but_back);

        button_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpActivity.this, HelpFormActivity.class);
                startActivity(intent);
                finish();
            }
        });

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }



    private void showList() {
        chapterList = new ArrayList<String>();
        topicList = new HashMap<String, List<String>>();

        chapterList.add("Как все работает?");
        chapterList.add("Где вы работаете?");
        chapterList.add("В какое время можно сделать заказ?");
        chapterList.add("Есть ли минимальная сумма заказа?");
        chapterList.add("Доставка бесплатная?");
        chapterList.add("Вы как-то гарантируете свежесть продуктов?");
        chapterList.add("Где почитать отзывы на сервис и продукты?");
        chapterList.add("Почему время доставки где-то 15-30 минут, а где-то 60?");
        chapterList.add("Что поменялось в работе сервиса на период каратнина?");
        chapterList.add("Когда вернутся деньги за продукты, которые мне не принесли?");

        List<String> topic1 = new ArrayList<>();
        topic1.add("Все работает так, как и должно работать.");

        List<String> topic2 = new ArrayList<>();
        topic2.add("Мы работаетм везде, где можно и нельзя.");

        List<String> topic3 = new ArrayList<>();
        topic3.add("В любое время после полуночи.");

        List<String> topic4 = new ArrayList<>();
        topic4.add("Минимальная сумма заказа - 666 рублей.");

        List<String> topic5 = new ArrayList<>();
        topic5.add("Доставка платная - 100 рублей.");

        List<String> topic6 = new ArrayList<>();
        topic6.add("Никак не гарантируется.");

        List<String> topic7 = new ArrayList<>();
        topic7.add("Где надо, тебе знать не надо.");

        List<String> topic8 = new ArrayList<>();
        topic8.add("Магия, не иначе.");

        List<String> topic9 = new ArrayList<>();
        topic9.add("Кое-что в этом мире не меняется. Но, к счастью, становится другим.");

        List<String> topic10 = new ArrayList<>();
        topic10.add("Какие деньги?");

        topicList.put(chapterList.get(0), topic1);
        topicList.put(chapterList.get(1), topic2);
        topicList.put(chapterList.get(2), topic3);
        topicList.put(chapterList.get(3), topic4);
        topicList.put(chapterList.get(4), topic5);
        topicList.put(chapterList.get(5), topic6);
        topicList.put(chapterList.get(6), topic7);
        topicList.put(chapterList.get(7), topic8);
        topicList.put(chapterList.get(8), topic9);
        topicList.put(chapterList.get(9), topic10);
    }
}