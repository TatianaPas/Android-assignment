package com.example.assignmentprojecttatianapasechnik;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

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
        plantsList.add(new ModelClass(R.drawable.snakeplant,"Sansevieria","Normal", "18-27", "Low Light"));
        plantsList.add(new ModelClass(R.drawable.birkin,"Philodendron","High", "Above 12", "Medium to Bright"));
        plantsList.add(new ModelClass(R.drawable.ficus1,"Ficus","Normal", "10-15", "Medium to Bright"));
        plantsList.add(new ModelClass(R.drawable.zzplant,"ZZ Plant","Average", "15-24", "Low to Bright"));
        plantsList.add(new ModelClass(R.drawable.maranta1,"Maranta","Mist frequently", "15-23", "Low to Medium"));
        plantsList.add(new ModelClass(R.drawable.syngonium,"Syngonium","High", "16-18", "Medium to Bright"));
        plantsList.add(new ModelClass(R.drawable.calathea,"Calathea","Mist Regularly", "16-23", "Medium"));
        plantsList.add(new ModelClass(R.drawable.alocasia,"Alocasia","Mist Occasionally", "18-24", "Bright Indirect"));
    }




    @Override
    public void onItemClick(int position) {
        if (position==0)
        {
            Intent intent = new Intent(this, HousePlantDescription.class);
            intent.putExtra("PlantHeading","Monstera");
            intent.putExtra("PlantPhoto", R.drawable.monstera2);
            intent.putExtra("description1","Monstera is a tropical plant from the Araceae family. Monstera is distinguished by its large, vibrant leaves as well as its distinctive pattern.");
            intent.putExtra("description2","Monstera Deliciosa thrives in bright and indirect sunlight. The ideal place for them to grow healthy and happy would be one that provides them with partial, even full shade.");
            startActivity(intent);
        } else if(position ==1){
            Intent intent = new Intent(this, HousePlantDescription.class);
            intent.putExtra("PlantHeading","Peperomia");
            intent.putExtra("PlantPhoto", R.drawable.peperomia);
            intent.putExtra("description1","Peperomia plants enjoy a potting soil that is well-aerated and well-draining. This species does best when watered from its roots.You should also let the soil dry out before you water your peperomia again.");
            intent.putExtra("description2","Peperomia plants have thick, juicy-looking leaves that store water, much like succulents, to help the plant through longer periods between watering. Peperomia is flexible and forgiving with light as long as you don’t have it in an extremely dark or extremely bright area.");
            startActivity(intent);
        } else if(position ==2){
            Intent intent = new Intent(this, HousePlantDescription.class);
            intent.putExtra("PlantHeading","Sansevieria");
            intent.putExtra("PlantPhoto", R.drawable.snakeplant_nobackground);
            intent.putExtra("description1","Sansevieria trifasciata, commonly known as the snake plant, is one of the most popular of houseplants.  These plants are easy to grow and, in many cases, are nearly indestructible. They will thrive in very bright light or almost dark corners of the house");
            intent.putExtra("description2"," Snake plants generally grow slowly in indoor light, but increasing its exposure to light will boost growth if it receives a few hours of direct sun. Planting and repotting is best done in the spring.");
            startActivity(intent);
        }else if(position ==3){
            Intent intent = new Intent(this, HousePlantDescription.class);
            intent.putExtra("PlantHeading","Philodendron");
            intent.putExtra("PlantPhoto", R.drawable.birkin);
            intent.putExtra("description1","The Philodendron Birkin grows to become a compact plant of rounded leaves which display dramatic pinstripe variegated lines across their face. The Philodendron Birkin prefers a rich bark/peat based soil which is not too heavy. It needs to be able to retain moisture, but not hold water. ");
            intent.putExtra("description2"," Remember to ensure the plant has moderate to bright indirect light to keep it happy and healthy. The Birkin will tolerate our dry indoor conditions, but thrives in humidity as most Philodendrons do. A misting from time to time would be welcomed.");
            startActivity(intent);
        }else if(position ==4){
            Intent intent = new Intent(this, HousePlantDescription.class);
            intent.putExtra("PlantHeading","Ficus");
            intent.putExtra("PlantPhoto", R.drawable.ficus1);
            intent.putExtra("description1","Indoor Ficus are best grown in a warm, brightly lit room, out of direct sunlight. ");
            intent.putExtra("description2","Water your plant as necessary to keep the potting mix evenly moist but not soggy. These plants also benefit from moderate humidity when grown indoors. The best way to increase the humidity around your plants is to fill your saucer with pebbles or gravel.");
            startActivity(intent);
        }else if(position ==5){
            Intent intent = new Intent(this, HousePlantDescription.class);
            intent.putExtra("PlantHeading","Zamioculcas");
            intent.putExtra("PlantPhoto", R.drawable.zzplant);
            intent.putExtra("description1"," Zamioculcas, or the ZZ Plant is an air cleansing plant that features shiny, deep green foliage with a unique spiral shape. It's an easy-care plant that not only looks great, but requires minimal effort. ZZ plant tolerates neglect, is drought tolerant, and accepts low-light conditions without throwing a fit.");
            intent.putExtra("description2","Situate your ZZ in low to bright indirect light, and water when fully dry.  ZZ is also very resistant to diseases and insects. ");
            startActivity(intent);
        }else if(position ==6){
            Intent intent = new Intent(this, HousePlantDescription.class);
            intent.putExtra("PlantHeading","Maranta");
            intent.putExtra("PlantPhoto", R.drawable.maranta2);
            intent.putExtra("description1","Prayer plants are low-growing, spreading plants that thrive best when provided with greenhouse-like conditions, including warm, moist, gentle airflow, and plenty of fertilizer.\n Plants that are kept too cool or too dry are likely to lose their leaves or suffer from fungal infections that can cause the plant to die from root rot or collapse. Likewise, plants that are exposed to too much sun can become washed out and develop brown blotches on their leaves.");
            intent.putExtra("description2","Hang or set your prayer plant near a window where it will receive indirect sunlight. Prayer plants are generally tolerant of lower light areas.");
            startActivity(intent);
        }else if(position ==7){
            Intent intent = new Intent(this, HousePlantDescription.class);
            intent.putExtra("PlantHeading","Syngonium");
            intent.putExtra("PlantPhoto", R.drawable.syngonium);
            intent.putExtra("description1","Syngoniums are a semi tropical plant and can come as either compact or trailing, as well as in a range of colours from green to dusty pinks. \n Syngoniums can start out as quite compact indoor plants, however they like to spread out once they get growing and can climb if they have support or trail over the side of the pot.");
            intent.putExtra("description2","Syngoniums will do best in moderate to bright but indirect sunlight, making them great for most areas of your home or office. Although a low light tolerant plant, they will grow quicker and maintain more vibrant colours if grown in bright indirect light.");
            startActivity(intent);
        }else if(position ==8){
            Intent intent = new Intent(this, HousePlantDescription.class);
            intent.putExtra("PlantHeading","Calathea");
            intent.putExtra("PlantPhoto", R.drawable.calathea);
            intent.putExtra("description1","Calatheas need specific care in order to thrive. They need a consistently warm spot and bright but indirect light – keep them out of direct sunshine. \nKeep the soil moist from spring to autumn, and provide some humidity by misting the leaves daily or standing on a tray of moist pebbles. Calatheas need to be watered with filtered or distilled water, or rainwater – not tap water.");
            intent.putExtra("description2","Calatheas do best in bright, indirect light but will tolerate a bit of shade. Avoid direct sunlight, as this will scorch the leaves, and keep away from draughts.");
            startActivity(intent);
        }else if(position ==9){
            Intent intent = new Intent(this, HousePlantDescription.class);
            intent.putExtra("PlantHeading","Alocasia");
            intent.putExtra("PlantPhoto", R.drawable.alocasia);
            intent.putExtra("description1","Alocasias need bright, but indirect light. This is due to the plant's natural habitat, on the forest floor beneath the tree canopy. Direct sun will cause the leaves to burn, so avoid placing your Alocasia in a spot where it'll be exposed to direct sun for a prolonged period.");
            intent.putExtra("description2","Always be sure to assess your plant’s watering needs upon receiving it. Before giving your plant a drink, it is best to check the moisture level in the soil first to ensure it isn’t moist right beneath the surface.");
            startActivity(intent);
        }

        else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}