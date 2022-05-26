package com.example.assignmentprojecttatianapasechnik;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class HousePlants extends AppCompatActivity implements CustomAdapter.OnItemListener {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> plantsList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_plants);

        initData();
        initRecyclerView();
    }


    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycle_view_houseplants);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new CustomAdapter(plantsList,this::onItemClick);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    private void initData() {
        plantsList = new ArrayList<>();
        plantsList.add(new ModelClass(R.drawable.monstera2,"Monstera","Average to High", "15-20", "Medium to Bright"));
        plantsList.add(new ModelClass(R.drawable.peperomia,"Peperomia","Medium", "Average", "Medium to Bright"));
        plantsList.add(new ModelClass(R.drawable.snakeplant,"Snake Plant","Normal", "18-27", "Low Light"));
        plantsList.add(new ModelClass(R.drawable.birkin,"Philodendron","High", "above 12", "Medium to Bright"));
        plantsList.add(new ModelClass(R.drawable.tradescantia,"Tradescantia","Moderate", "10-15", "Bright Indirect"));
        plantsList.add(new ModelClass(R.drawable.zzplant,"ZZ Plant","Average", "15-24", "Low to Bright"));
        plantsList.add(new ModelClass(R.drawable.palm,"Palm","High", "above 10", "Low light"));
        plantsList.add(new ModelClass(R.drawable.syngonium,"Syngonium","High", "16-18", "Medium to Bright"));
        plantsList.add(new ModelClass(R.drawable.calathea,"Calathea","Mist Regularly", "16-23", "Medium"));
        plantsList.add(new ModelClass(R.drawable.alocasia,"Alocasia","Mist Occasionally", "18-24", "Bright Indirect"));
    }


    @Override
    public void onItemClick(int position) {
        if (position==0)
        {
            Intent intent = new Intent(this, PlantDescription.class);
            startActivity(intent);
        } else if(position ==1){
            Intent intent = new Intent(this, Pots.class);
            startActivity(intent);
        } else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}