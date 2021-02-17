package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class HelpFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_form);
    }

    public void ClickSend(View view)
    {
        /*
        //Toast.makeText(this, "Данные отправлены (нет)", Toast.LENGTH_SHORT).show();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         */

        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
        finish();
    }

    public void ClickCancel(View view)
    {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
        finish();
    }
}