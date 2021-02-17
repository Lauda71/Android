package com.example.task_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.CardsViewHolder> {

    ArrayList<Cards> cardsLocation;

    public CardsAdapter(ArrayList<Cards> cardsLocation) {
        this.cardsLocation = cardsLocation;
    }

    @NonNull
    @Override
    public CardsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_cards, parent, false);
        CardsViewHolder cardsViewHolder = new CardsViewHolder(view);
        return cardsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardsViewHolder holder, int position) {

        Cards cards = cardsLocation.get(position);

        holder.card_image.setImageResource(cards.getCard_image());
    }

    @Override
    public int getItemCount() {
        return cardsLocation.size();
    }

    public static class CardsViewHolder extends RecyclerView.ViewHolder{

        ImageView card_image;

        public CardsViewHolder(@NonNull View itemView) {
            super(itemView);

            card_image = itemView.findViewById(R.id.card_image);
        }
    }
}
