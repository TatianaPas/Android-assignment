package com.example.assignmentprojecttatianapasechnik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardHousePlants = (CardView)findViewById(R.id.house_plants);
        cardHousePlants.setOnClickListener(CardHousePlantsHandler);

        CardView cardSucculents = (CardView) findViewById(R.id.card_succulents);
        cardSucculents.setOnClickListener(CardSucculentsHandler);

        CardView cardPots = (CardView) findViewById(R.id.card_pots);
        cardPots.setOnClickListener(CardPotsHandler);



    }

    View.OnClickListener CardHousePlantsHandler = new View.OnClickListener(){
        public void onClick(View view) {
            Intent housePlants = new Intent(getBaseContext(), GroundCovers.class);
            startActivity(housePlants);
        }
    };

    View.OnClickListener CardSucculentsHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent succulents = new Intent(getBaseContext(),Succulents.class);
            startActivity(succulents);
        }
    };

    View.OnClickListener CardPotsHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent pots = new Intent(getBaseContext(),Pots.class);
            startActivity(pots);
        }
    };


}