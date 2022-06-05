package com.example.assignmentprojecttatianapasechnik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Succulents extends AppCompatActivity implements CustomAdapterSucculents.OnItemListener{

    RecyclerView recyclerViewSucculent;
    LinearLayoutManager layoutManager;
    List<ModelClassSucculent> succulentssList;
    CustomAdapterSucculents adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succulents);
        initDataSucculents();
        initRecyclerViewSucculent();
    }

    private void initRecyclerViewSucculent() {
        recyclerViewSucculent = findViewById(R.id.recycle_view_succulents);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerViewSucculent.setLayoutManager(layoutManager);
        adapter = new CustomAdapterSucculents(succulentssList,this::onItemClick);
        recyclerViewSucculent.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initDataSucculents() {
        succulentssList = new ArrayList<>();
        succulentssList.add(new ModelClassSucculent(R.drawable.echeveria_lilacina, "Echeveria Lilacina", "Species: Crassulaceae", "Color: Silvery Grey"));
        succulentssList.add(new ModelClassSucculent(R.drawable.echeveria_green_rose, "Echeveria Elegans", "Species: Crassulaceae", "Color: Green"));
        succulentssList.add(new ModelClassSucculent(R.drawable.echeveria_lilly, "Echeveria Water Lily", "Species: Crassulaceae", "Color: Green/Pink"));
        succulentssList.add(new ModelClassSucculent(R.drawable.echeveria_elegance, "Echeveria Green Rose", "Species: Crassulaceae", "Color: Green"));
        succulentssList.add(new ModelClassSucculent(R.drawable.sedum_gold, "Sedum Gold Mound", "Species: Sedum", "Color: Green/Yellow"));
        succulentssList.add(new ModelClassSucculent(R.drawable.succulent_dark, "Aeonium Schwarzkopf", "Species: Aeonium", "Color: Dark Brown"));
        succulentssList.add(new ModelClassSucculent(R.drawable.jade_plant, "Senecio Jacobsenii", "Species: Asteraceae", "Color: Green"));
        succulentssList.add(new ModelClassSucculent(R.drawable.echeveria_black_knight, "Echeveria Black Knight", "Species: Crassulaceae", "Color: Brown/ Green"));
        succulentssList.add(new ModelClassSucculent(R.drawable.sedum_big, "Sedum Hispanicum", "Species: Sedum", "Color: Blue/ Green"));
        succulentssList.add(new ModelClassSucculent(R.drawable.succulent_green_round, "Sedum Rubrotinctum", "Species: Sedum", "Color: Green"));


    }
    public void onItemClick(int position) {
        if (position==0)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Echeveria Lilacina");
            intent.putExtra("photo", R.drawable.echeveria_lilacina);
            intent.putExtra("description1","Echeveria lilacina name comes from the fact that its dusty leaves carry a lilac hue. Lilacina Echeverias like plenty of sunlight and warmth. \n Generally speaking, more sun exposure produces better performance, brighter colors and stronger, sturdier leaves and stems.");
            intent.putExtra("description2","Take care to water from below, and only water when the soil is nearly dry. During the spring and summer months, fertilize Echeveria lilacina using a water-soluble liquid fertilizer with a low to medium nitrogen content");
            startActivity(intent);
        }else if (position==1)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Echeveria Elegans");
            intent.putExtra("photo", R.drawable.echeveria_green_rose);
            intent.putExtra("description1","Echeveria Elegans clump-forming succulent comprised of evergreen rosettes. Grows up to 25cm tall and wide. \n Prefers full sun to partial shade, with sandy, well-drained soil. This succulent is drought-tolerant but does best with occasional watering.");
            intent.putExtra("description2","Water moderately in growth periods (winter) and sparingly when dormant (summer). The plant needs water when its lower leaves become soft or wrinkled. Plump leaves are a sign that all is well with the roots. Avoid getting the soil too wet. Water from the base by standing the pot in a dish of water.");
            startActivity(intent);
        }
        else if (position==2)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Echeveria Water Lily");
            intent.putExtra("photo", R.drawable.echeveria_lilly);
            intent.putExtra("description1","Echeveria ‘Water Lily’ is best known to be a wonderful succulent. The plant has mostly green fleshy leaves the turn red when stressed correctly. This plant is ideal for people new to succulents as it is easy to grow. When it flowers you can expect flowers that are often compared to water lily, that is where the name comes from.");
            intent.putExtra("description2","The watering method is very important to keep your Water Lily healthy. It should not sit on the water, and an excess amount of water should be avoided. The best way of watering is soak and dry method this succulent.");
            startActivity(intent);
        }
        else if (position==3)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Echeveria Green Rose");
            intent.putExtra("photo", R.drawable.echeveria_elegance);
            intent.putExtra("description1","‘Green Rose’ is known to be a hybrid between the Echeveria Derenbergii and Sedum Palmeri. The plants most notable feature would be the leaves that are bright green with red edges. When it flowers you can expect it to produce star-shaped yellow flowers during the summer.");
            intent.putExtra("description2","It should not sit on the water, and an excess amount of water should be avoided. The best way of watering is soak and dry method this succulent. Yet, the succulent should be controlled to avoid overwatering.");
            startActivity(intent);
        }
        else if (position==4)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Sedum Gold Mound");
            intent.putExtra("photo", R.drawable.sedum_gold);
            intent.putExtra("description1","'Gold Mound' is a mat-forming, evergreen perennial with succulent, bright, yellow-green leaves. In spring and summer, it bears yellow flowers. Needs little care and can be cut back hard to retain size.  Sedum likes a dry soil bit can handle moist soils and grows up to 15 x 75 cm.  The flower is a bright yellow fluffy flower that covers the plant in summer.");
            intent.putExtra("description2","Works well in containers and in particular hanging baskets, a fantastic colour for contrast. is bright yellow in full sun but this can green off to a vibrant lime colour if planted in shade.");
            startActivity(intent);
        }
        else if (position==5)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Aeonium Schwarzkopf");
            intent.putExtra("photo", R.drawable.succulent_dark);
            intent.putExtra("description1","Schwarzkopf is a perennial succulent that grows to a height of 0.6m, with a spread of 0.4m.  It is Moderate growing, taking one to two years to reach its mature size.  Flowers bloom in winter, from November to January.");
            intent.putExtra("description2","Requirements: Grows in full sun, and part shade.  It can be adequately protected from the sun by the overhead branches of adjacent trees.It needs well-drained soil; and a raised bed may be helpful in allowing for efficient draining. Note that Aeoniums do not tolerate frost. \n Water usage: very low little watering (once a month).");
            startActivity(intent);
        }
        else if (position==6)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Senecio Jacobsenii");
            intent.putExtra("photo", R.drawable.jade_plant);
            intent.putExtra("description1","Senecio Jacobsenii makes a great display in a hanging basket or as a window box specimen in containers and hence, is ideal for full sun balconies, terraces, patios, as well as for growing indoors; it makes an excellent houseplant.");
            intent.putExtra("description2","The plant appreciates moist soil during the summer, be careful to not over water as the plant cannot tolerate wet soil for extended periods of time. Since the plant goes into dormancy during the winter, let the soil dry out between waterings in the cold weather. ");
            startActivity(intent);
        }
        else if (position==7)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Echeveria Black Knight");
            intent.putExtra("photo", R.drawable.echeveria_black_knight);
            intent.putExtra("description1","Also known as Mexican hen and chicks, Black Knight echeveria is an attractive succulent plant with rosettes of fleshy, pointy, blackish purple leaves. \n The new growth in the center of Black Knight rosettes provides a bright green contrast to the dark outer leaves. In late summer and fall, Black Knight succulents produce colorful, coral-red blooms atop slender, arching stalks.");
            intent.putExtra("description2","Black Knight succulents prefer full sunlight, but a little afternoon shade is a good idea if you live in a hot climate. Intense afternoon sunlight may be too intense. Indoors, echeveria Black Knight needs a sunny window, but no direct sunlight during hot afternoons.");
            startActivity(intent);
        }
        else if (position==8)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Sedum Hispanicum");
            intent.putExtra("photo", R.drawable.sedum_big);
            intent.putExtra("description1","Silvery-gray to blue carpet-like foliage creates very low, evergreen mats. Most varieties of succulents need at least half a day to a full day of sunlight.");
            intent.putExtra("description2","Succulents need good draining soil. For container planting you can purchase cactus soil or incorporate sand, gravel or volcanic rock for better drainage. The container you are planting in should have a drainage hole.\n After planting, water in well and allow the soil to dry between waterings. Water when soil is dry and the sun is shining. Succulents don’t like to have wet feet.");
            startActivity(intent);
        }
        else if (position==9)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Sedum Rubrotinctum");
            intent.putExtra("photo", R.drawable.succulent_green_round);
            intent.putExtra("description1","Sedum rubrotinctum or Jelly Beans is a lively plant that requires little more care than a rock. It’s perfect for neglectful gardeners. ");
            intent.putExtra("description2","Full sun to partial shade is ideal for Pork and Beans. The more sun exposure your succulent gets, the deeper its colors will be. Remember though that Pork and Beans can get sunburned if exposed to full sun and high heat. \n When it comes to water, Sedum rubrotinctum needs the “soak and dry” method. This means that you wait for the soil to dry out completely and then water it thoroughly. Your succulent should never be sitting in water for long periods of time.");
            startActivity(intent);
        }

        else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        }


}