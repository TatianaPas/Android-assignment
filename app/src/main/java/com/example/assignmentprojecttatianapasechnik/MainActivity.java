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

        CardView cardGroundcoverPlants = (CardView)findViewById(R.id.card_groundcover);
        cardGroundcoverPlants.setOnClickListener(CardGroundcoverPlantsHandler);

        CardView cardSucculents = (CardView) findViewById(R.id.card_succulents);
        cardSucculents.setOnClickListener(CardSucculentsHandler);

        CardView cardFlowering = (CardView) findViewById(R.id.card_flowering);
        cardFlowering.setOnClickListener(CardFloweringHandler);



    }

    View.OnClickListener CardGroundcoverPlantsHandler = new View.OnClickListener(){
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

    View.OnClickListener CardFloweringHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent flowers = new Intent(getBaseContext(), Flowering.class);
            startActivity(flowers);
        }
    };


}