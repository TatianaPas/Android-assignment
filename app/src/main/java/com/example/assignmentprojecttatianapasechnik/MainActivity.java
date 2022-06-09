package com.example.assignmentprojecttatianapasechnik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;


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

        layout=(LinearLayout) findViewById(R.id.container_main);

        // set a nice look of transition without flash
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(androidx.appcompat.R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
    }

    View.OnClickListener CardGroundcoverPlantsHandler = new View.OnClickListener(){
        public void onClick(View view) {
            Fade fade = new Fade();
            fade.setDuration(5000);
            TransitionManager.beginDelayedTransition(layout, fade);

            Intent housePlants = new Intent(getBaseContext(), GroundCovers.class);
            startActivity(housePlants);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        }
    };

    View.OnClickListener CardSucculentsHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent succulents = new Intent(getBaseContext(),Succulents.class);
            startActivity(succulents);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    };

    View.OnClickListener CardFloweringHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent flowers = new Intent(getBaseContext(), Flowering.class);
            startActivity(flowers);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        }
    };


}