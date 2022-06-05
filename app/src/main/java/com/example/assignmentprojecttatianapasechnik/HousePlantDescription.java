package com.example.assignmentprojecttatianapasechnik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HousePlantDescription extends AppCompatActivity {

    TextView plantHeadign;
    ImageView plantPhoto;
    TextView description1;
    TextView description2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groundcover_description);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {

            //Set data according to plant clicked
            plantHeadign=findViewById(R.id.plant_heading);
            plantHeadign.setText(getIntent().getStringExtra("PlantHeading"));

            plantPhoto = findViewById(R.id.picture);
            plantPhoto.setImageResource((bundle.getInt("PlantPhoto")));

            description1= findViewById(R.id.firstDescription);
            description1.setText(bundle.getString("description1"));

            description2 = findViewById(R.id.secondDescription);
            description2.setText(bundle.getString("description2"));

            TextView mainPage = (TextView) findViewById(R.id.backToMain);
            mainPage.setOnClickListener(backToMain);
            TextView categoryPage = (TextView) findViewById(R.id.backToCategory);
            categoryPage.setOnClickListener(backToCategory);
        }

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