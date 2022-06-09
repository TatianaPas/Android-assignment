package com.example.assignmentprojecttatianapasechnik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SuculentDescription extends AppCompatActivity {
    TextView plantName;
    ImageView plantPhoto;
    TextView description1;
    TextView description2;
    TextView link;

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

            link=findViewById(R.id.backToCategory_Succulent);
            link.setText(bundle.getString("link"));

            TextView mainPage = (TextView) findViewById(R.id.backToMainSucculent);
            mainPage.setOnClickListener(backToMain);
            TextView categoryPage = (TextView) findViewById(R.id.backToCategory_Succulent);
            categoryPage.setOnClickListener(backToCategory);
        }


        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(androidx.appcompat.R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

    }


    View.OnClickListener backToMain = new View.OnClickListener(){
        public void onClick(View view) {
            Intent mainPageView = new Intent(getBaseContext(),MainActivity.class);
            startActivity(mainPageView);
        }
    };
// the view reused by 2 categories
    View.OnClickListener backToCategory = new View.OnClickListener(){
        public void onClick(View view) {

            TextView text_link=(TextView) findViewById(R.id.backToCategory_Succulent);
            String text = text_link.getText().toString();
// check if text contains word Succulent, then display succulents category, if not, display flowering plants category
            if(text.contains("Succulents")) {
                Intent succulents = new Intent(getBaseContext(), Succulents.class);
                startActivity(succulents);
            }
            else{
                Intent succulents = new Intent(getBaseContext(), Flowering.class);
                startActivity(succulents);
            }
        }
    };
    }
