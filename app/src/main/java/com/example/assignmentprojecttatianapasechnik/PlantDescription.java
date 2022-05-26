package com.example.assignmentprojecttatianapasechnik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlantDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_description);

        TextView mainPage = (TextView) findViewById(R.id.backToMain);
        mainPage.setOnClickListener(backToMain);
        TextView categoryPage = (TextView) findViewById(R.id.backToCategory);
        categoryPage.setOnClickListener(backToCategory);

    }


    View.OnClickListener backToMain = new View.OnClickListener(){
        public void onClick(View view) {
            Intent mainPageView = new Intent(getBaseContext(),MainActivity.class);
            startActivity(mainPageView);
        }
    };

    View.OnClickListener backToCategory = new View.OnClickListener(){
        public void onClick(View view) {
            Intent housePlants = new Intent(getBaseContext(),HousePlants.class);
            startActivity(housePlants);
        }
    };



}