package com.example.assignmentprojecttatianapasechnik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Flowering extends AppCompatActivity {

    RecyclerView recyclerViewFlower;
    LinearLayoutManager layoutManager;
    List<ModelClassSucculent> flowersList;
    CustomAdapterSucculents adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowering);
        initDataSFlowering();
        initRecyclerViewFlowering();



// inicialise navigation menu on top of the page, set onClick listeners
        TextView succulentsCategury = (TextView) findViewById(R.id.toSucculents);
        succulentsCategury.setOnClickListener(toSucculents);
        TextView groundCategury = (TextView) findViewById(R.id.toGroundCovers);
        groundCategury.setOnClickListener(toGroundcovers);
    }
   // redirect to Succulent category
    View.OnClickListener toSucculents = new View.OnClickListener(){
        public void onClick(View view) {
            Intent categories = new Intent(getBaseContext(), Succulents.class);
            startActivity(categories);
        }
    };
    // redirect to Groundcovers category
    View.OnClickListener toGroundcovers = new View.OnClickListener(){
        public void onClick(View view) {
            Intent categories = new Intent(getBaseContext(), GroundCovers.class);
            startActivity(categories);
        }
    };



    private void initRecyclerViewFlowering() {
        recyclerViewFlower = findViewById(R.id.recylce_view_flowering);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerViewFlower.setLayoutManager(layoutManager);
        adapter = new CustomAdapterSucculents(flowersList,this::onItemClick);
        recyclerViewFlower.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initDataSFlowering() {
        flowersList = new ArrayList<>();
        flowersList.add(new ModelClassSucculent(R.drawable.pink_flower, "Polyanthus", "Species: Primulaceae", "Color: Pink"));
        flowersList.add(new ModelClassSucculent(R.drawable.purple_flower, "Cool Wave Morpho Pancy", "Species: Violaceae", "Color: Purple/ Yellow"));
        flowersList.add(new ModelClassSucculent(R.drawable.pink_daisy, "Aster Daisy", "Species: Asteraceae", "Color: Purple"));
        flowersList.add(new ModelClassSucculent(R.drawable.cyclamen, "Cyclamen Purpurascens", "Species: Primulaceae", "Color: Purple"));
        flowersList.add(new ModelClassSucculent(R.drawable.begonia_1, "Begonia Double Up", "Species: Begonia", "Color: Red"));
        flowersList.add(new ModelClassSucculent(R.drawable.white_flower1, "Sweet Alyssum", "Species: Brassicaceae", "Color: White"));
        flowersList.add(new ModelClassSucculent(R.drawable.red_flower, "Viola", "Species: Violaceae", "Color: Deep Red"));
        flowersList.add(new ModelClassSucculent(R.drawable.yellow_flower, "Siebold Primrose", "Species: Primulaceae", "Color: Yellow"));
        flowersList.add(new ModelClassSucculent(R.drawable.purple_yellow_flower, "Delta Speedy Purple Pancy", "Species: Violaceae", "Color: Blue/ Green"));
        flowersList.add(new ModelClassSucculent(R.drawable.pink_white_flower, "Allioni's Primrose", "Species: Primulaceae", "Color: Pink/Yellow"));

    }
    public void onItemClick(int position) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}