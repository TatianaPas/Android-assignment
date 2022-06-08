package com.example.assignmentprojecttatianapasechnik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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
        flowersList.add(new ModelClassSucculent(R.drawable.pink_flower, "Polyanthus", "Primulaceae", "Pink"));
        flowersList.add(new ModelClassSucculent(R.drawable.purple_flower, "Cool Wave Morpho Pansy", "Violaceae", "Purple/ Yellow"));
        flowersList.add(new ModelClassSucculent(R.drawable.pink_daisy, "Branchyscome Brasco", "Brachyscome ", "Purple"));
        flowersList.add(new ModelClassSucculent(R.drawable.cyclamen, "Cyclamen Purpurascens", "Primulaceae", "Purple"));
        flowersList.add(new ModelClassSucculent(R.drawable.begonia_1, "Begonia Double Up", "Begoniaceae", "Red"));
        flowersList.add(new ModelClassSucculent(R.drawable.white_flower1, "Sweet Alyssum", "Brassicaceae", "White"));
        flowersList.add(new ModelClassSucculent(R.drawable.red_flower, "Viola", "Violaceae", "Deep Red"));
        flowersList.add(new ModelClassSucculent(R.drawable.yellow_flower, "Siebold Primrose", "Primulaceae", "Yellow"));
        flowersList.add(new ModelClassSucculent(R.drawable.purple_yellow_flower, "Delta Speedy Purple Pansy", "Violaceae", "Blue/ Green"));
        flowersList.add(new ModelClassSucculent(R.drawable.pink_white_flower, "Allioni's Primrose", "Primulaceae", "Pink/Yellow"));

    }
    public void onItemClick(int position) {
        if (position==0)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Polyanthus");
            intent.putExtra("photo", R.drawable.pink_flower);
            intent.putExtra("description1","Polyanthus is the common name of Primula x polyantha, or cottage primrose, as they are also known.\n These little gems are happy in full sun or a shady spot. If you have a shady position, make sure it isn’t too dark, as they do need daylight to stimulate flower bud initiation and leaf growth.");
            intent.putExtra("description2","To trigger loads of flowers, avoid feeding polys and prims with anything that has a high nitrogen component. Dried blood is the ‘go-to’ plant food, and it’s organic and, therefore, chemical free. You will find it in our Garden Centres. Sprinkle it around the base of each plant at planting time, then again six weeks after. It stimulates masses of flower buds and promotes healthy dark-green foliage growth.");
            intent.putExtra("link", "Back To Flowering Plants");
            startActivity(intent);
        }else if (position==1)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Cool Wave Morpho Pansy");
            intent.putExtra("photo", R.drawable.purple_flower);
            intent.putExtra("description1","These Cool Wave Morpho pansies are long-lasting and retain their bright pastel blue and yellow bloom throughout the spring and fall seasons. They’re easy to care for and hold up well in rain and adverse weather.");
            intent.putExtra("description2","They have a spreading habit that cascades over pots up to as much as 30”. They can be planted as a spiller, or as a dramatic groundcover. \n Plant your pansies in moist, rich, well-drained soil.  Amend your soil ahead of time or during planting with compost, manure, or other soil amendments.  Pansies should be planted where they can get at least 6 hours or more of direct sunlight.");
            intent.putExtra("link", "Back To Flowering Plants");
            startActivity(intent);
        }
        else if (position==2)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Branchyscome Brasco");
            intent.putExtra("photo", R.drawable.pink_daisy);
            intent.putExtra("description1","Some of the common names for the plant that are used in the garden include Swan river daisy, Cut leaved daisy, Yellow tongue daisy, Surdaisy White, Rocky daisy, and Variable daisy.");
            intent.putExtra("description2","Plants have a compact nature, grey-green leaves, and usually come into flower in the summer and autumn.\n They can be grown in full sunlight or partially shaded conditions, and can tolerate dry soils.\n Trim back in late winter to allow new growth to retain bushy habit. Apply slug bait and fertiliser regularly.");
            intent.putExtra("link", "Back To Flowering Plants");
            startActivity(intent);
        }
        else if (position==3)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Cyclamen Purpurascens");
            intent.putExtra("photo", R.drawable.cyclamen);
            intent.putExtra("description1","Your cyclamen needs a cool, bright spot to thrive. Keep in a cool room that’s around 10-15°C – a cool conservatory, porch, or east- or north-facing windowsill is ideal (bring it inside if frost is forecast overnight). Keep away from direct sunlight. If you keep your cyclamen in a warm room, the leaves will turn yellow, the flowers will quickly fade and the plant will go into early dormancy.");
            intent.putExtra("description2","Water once the soil begins to feel dry. Rather than watering with a watering can, which can splash water on the leaves causing mildew, stand the plant in a saucer or shallow bowl of water for an hour or so until the compost is moist but not soaking wet. Let any excess water drain away.");
            intent.putExtra("link", "Back To Flowering Plants");
            startActivity(intent);
        }
        else if (position==4)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Begonia Double Up");
            intent.putExtra("photo", R.drawable.begonia_1);
            intent.putExtra("description1","To help your Double Begonia grow well and bloom prolifically, provide warm temperatures, little watering, and well-draining soil. They are easily grown inside or outside with low maintenance.");
            intent.putExtra("description2","After planting, water the young plant frequently for the first 2 weeks to keep the soil slightly damp. Later on, in the growing season, water the plant only when the soil is dry. Never let the soil get waterlogged or soggy.");
            intent.putExtra("link", "Back To Flowering Plants");
            startActivity(intent);
        }
        else if (position==5)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Sweet Alyssum");
            intent.putExtra("photo", R.drawable.white_flower1);
            intent.putExtra("description1","Alyssum (Lobularia maritima) produce long lasting masses of tiny pink, white, violet and cream blooms. These beautiful flowers are easy to grow, are ideal as a border, ground cover, hanging baskets or in pots. Their lovely scent is a favourite amongst cottage gardeners and they are great to beneficial insects and bees into the garden.");
            intent.putExtra("description2","For a real cottage look in your garden, scatter the seeds around the garden bed in various locations and water in well.");
            intent.putExtra("link", "Back To Flowering Plants");
            startActivity(intent);
        }
        else if (position==6)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Viola");
            intent.putExtra("photo", R.drawable.red_flower);
            intent.putExtra("description1","Violas are primarily cool-season bloomers: They are perfect for starting and ending the season in colder climates, and for bridging the seasons in warmer zones where they can remain in bloom throughout the winter. ");
            intent.putExtra("description2","Violas like full sun, but not the heat it brings. This isn’t a problem in cool spring temperatures, but when planting in the summer, make sure they get some shade during the hottest part of the afternoon. \n Water regularly, but allow the soil to dry out between waterings. They can tolerate some drought but will bloom best with regular watering.");
            intent.putExtra("link", "Back To Flowering Plants");
            startActivity(intent);}
        else if (position==7)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Siebold Primrose");
            intent.putExtra("photo", R.drawable.yellow_flower);
            intent.putExtra("description1","Primula sieboldii appear in a range of colours, from white (and here we really do mean white, not cream or ivory) through to rich pinks and blue lilacs. The petal shapes are equally varied, from regular petals through to extravagantly divided ones.");
            intent.putExtra("description2","Primula is an enormous genus, with much botanical wrangling over classification. All are early and free flowering, starting into growth at low temperatures, which gives them a head start over neighbouring plants. All are from relatively unstable habitats, so produce plenty of seed to keep the species going, but rarely make reliably long-lived garden plants.");
            intent.putExtra("link", "Back To Flowering Plants");
            startActivity(intent);
        }
        else if (position==8)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Delta Speedy Purple Pansy");
            intent.putExtra("photo", R.drawable.purple_yellow_flower);
            intent.putExtra("description1","The Delta Speedy Purple pansies are deep purple with a faint blotch. They’re annuals that bloom late fall through winter in the south and west, and early spring in the north, Zone 7-10. This variety has masses of large upward-facing blooms, reaching a height of 6-8”.");
            intent.putExtra("description2","They are very tolerant of harsh weather, and they have a continuing flower capacity even under low light. \n This may seem obvious, but make sure you are watering your pansies.  One of the most common reasons that pansies don’t do well is due to them not getting enough water.  For pansies in containers, if the temperatures are warm, they may even need to be watered twice a day.");
            intent.putExtra("link", "Back To Flowering Plants");
            startActivity(intent);
        }
        else if (position==9)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Allioni's Primrose");
            intent.putExtra("photo", R.drawable.pink_white_flower);
            intent.putExtra("description1","Primrose plants, also known as Primula vulgaris, are small, fragranced, flowering plants that light up with a variety of colors during their spring and summer-blooming seasons. ");
            intent.putExtra("description2","Primrose plants also grow beautifully in potted environments, as well. They can light up your balcony or porch with many bright colors and even spread their sweet-smelling fragrance throughout the area. In pots, they are also great for lining flowerbeds, walkways, or even the entrance to your home. Similarly, the flowers will grow beautifully in a window box to further decorate your home. Indoor houseplant collectors can also benefit from the plant's beautiful flowers that can bloom easily and abundantly within your home.");
            intent.putExtra("link", "Back To Flowering Plants");
            startActivity(intent);
        }

        else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }


}