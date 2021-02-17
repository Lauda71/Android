package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity {

    RecyclerView recyclerView_cards;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        recyclerView_cards = findViewById(R.id.recyclerview_cards);
        recyclerView_cards();
    }

    private void recyclerView_cards() {
        recyclerView_cards.setHasFixedSize(true);
        recyclerView_cards.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Cards> cardsLocations = new ArrayList<>();

        cardsLocations.add(new Cards(R.mipmap.card1));
        cardsLocations.add(new Cards(R.mipmap.card2));
        cardsLocations.add(new Cards(R.mipmap.card3));

        adapter = new CardsAdapter(cardsLocations);
        recyclerView_cards.setAdapter(adapter);
    }
}