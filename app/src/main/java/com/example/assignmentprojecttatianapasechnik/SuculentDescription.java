package com.example.assignmentprojecttatianapasechnik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SuculentDescription extends AppCompatActivity {
    TextView plantName;
    ImageView plantPhoto;
    TextView description1;
    TextView description2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suculent_description);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {

            //Set data according to plant clicked
            plantName=findViewById(R.id.sucuclentName);
            plantName.setText(getIntent().getStringExtra("plantName"));


            plantPhoto = findViewById(R.id.photo_succulent);
            plantPhoto.setImageResource((bundle.getInt("photo")));

            description1= findViewById(R.id.firstDescriptionSucculent);
            description1.setText(bundle.getString("description1"));

            description2 = findViewById(R.id.secondDescriptionDucculent);
            description2.setText(bundle.getString("description2"));

            TextView mainPage = (TextView) findViewById(R.id.backToMainSucculent);
            mainPage.setOnClickListener(backToMain);
            TextView categoryPage = (TextView) findViewById(R.id.backToCategorySucculent);
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
            Intent succulents = new Intent(getBaseContext(),Succulents.class);
            startActivity(succulents);
        }
    };
    }
