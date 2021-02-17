package com.example.task_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    // Переменные
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_draw_open, R.string.nav_draw_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_map);
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id. nav_map:
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_segment_2:
                // при выборе "Сегмент2"
                Toast.makeText(this, "Возможно, скоро появится...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_segment_3:
                // при выборе "Сегмент3"
                Toast.makeText(this, "Возможно, скоро появится...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_become_a_courier:
                // при выборе "Сегмент4"
                Intent intent_courier = new Intent(MainActivity.this, BecomeACourierActivity.class);
                startActivity(intent_courier);
                break;
            case R.id.nav_help:
                Intent intent_help = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(intent_help);
                break;

            case R.id.nav_settings:
                // при выборе "Настройки"
                Toast.makeText(this, "Настроек пока нет (:", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_exit:
                // при выборе "Выход"
                Toast.makeText(this, "Выхода тоже пока нет!", Toast.LENGTH_SHORT).show();
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}