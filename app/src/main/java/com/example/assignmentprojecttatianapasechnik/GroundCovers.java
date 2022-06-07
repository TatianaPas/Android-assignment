package com.example.assignmentprojecttatianapasechnik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GroundCovers extends AppCompatActivity implements CustomAdapter.OnItemListener {

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

        TextView BackToCategory = (TextView) findViewById(R.id.backToCategoriesBtn);
        BackToCategory.setOnClickListener(backToCategoryClick);
    }
    View.OnClickListener backToCategoryClick = new View.OnClickListener(){
        public void onClick(View view) {
            Intent categories = new Intent(getBaseContext(), MainActivity.class);
            startActivity(categories);
        }
    };


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
        plantsList.add(new ModelClass(R.drawable.turntles,"Peperomia Prostrata","Lightly Moist", "White", "Bright"));
        plantsList.add(new ModelClass(R.drawable.thymus_door,"Thymus Doone Valley","Low Water", "Pink", "Full Sun"));
        plantsList.add(new ModelClass(R.drawable.pratia_country,"Pratia County Park","Moist", "Blue", "Semi-shade"));
        plantsList.add(new ModelClass(R.drawable.thymus2,"Dichondra Emerald Falls","High", "No Flowers", "Partial Sun"));
        plantsList.add(new ModelClass(R.drawable.falls,"Soleirolia Soleirolii","Normal", "Creamy White", "Partial Sun"));
        plantsList.add(new ModelClass(R.drawable.pratia_rubella,"Pratia Rubella Alba","Average", "White", "Full Sun"));
        plantsList.add(new ModelClass(R.drawable.scleranthus,"Scleranthus Biflorus","Moist", "Green", "Sun/ Shade"));
        plantsList.add(new ModelClass(R.drawable.thymus_poly,"Thymus Pulegioides","Average", "Purple", "Full Sun"));
        plantsList.add(new ModelClass(R.drawable.pratia_angulata,"Pratia Angulata","Moist/ Wet", "White", "Shady"));
        plantsList.add(new ModelClass(R.drawable.thymus1,"Ficus Pumila","Moist", "No Flowers", "Bright Indirect"));
    }




    @Override
    public void onItemClick(int position) {
        if (position==0)
        {
            Intent intent = new Intent(this, GroundCoverDescription.class);
            intent.putExtra("PlantHeading","Peperomia Prostrata");
            intent.putExtra("PlantPhoto", R.drawable.turntles);
            intent.putExtra("description1","Peperomia prostrata 'String of Turtles' has striking foliage with beautiful markings that resemble that of a turtle shell. These plants are incredibly popular and are a must have for any avid plant collector.");
            intent.putExtra("description2","String of turtles love lots of bright indirect light - keep away from direct sunlight as this will scorch the leaves. \n This plant likes to be kept in lightly moist soil throughout the growing season but does require the soil to dry down more in the winter months.");
            startActivity(intent);
        } else if(position ==1){
            Intent intent = new Intent(this, GroundCoverDescription.class);
            intent.putExtra("PlantHeading","Thymus Doone Valley");
            intent.putExtra("PlantPhoto", R.drawable.thymus_door);
            intent.putExtra("description1","Doone Valley has varigated yellow and green foliage that is intensely lemon scented. It grows as a mounded plant and blooms in summer with lots of pink flower clusters covering the plant.");
            intent.putExtra("description2"," It grows with a mounding habit, blooming heavily in summer with large pink flower clusters. The unusual deep green foliage is flecked with yellow and is an evergreen. Very fragrant underfoot along pathways and between flagstone. Summer blooming.");
            startActivity(intent);
        } else if(position ==2){
            Intent intent = new Intent(this, GroundCoverDescription.class);
            intent.putExtra("PlantHeading","Pratia County Park");
            intent.putExtra("PlantPhoto", R.drawable.pratia_country);
            intent.putExtra("description1","Spreading ground cover that forms a mat of rooting stems. Small bright green toothed leaves. A mass of blue flowers in the spring and summer. Great in between paving stones and rocks. Avoid very dry, or hot and sunny sites. Very hardy to cold and can grow in damp sites.");
            intent.putExtra("description2","Best performance is in part shade. Avoid the hottest driest sites. May be used among pavers. Dies out in heavy compacted soils- provide a top dress of compost annually to avoid this.");
            startActivity(intent);
        }else if(position ==3){
            Intent intent = new Intent(this, GroundCoverDescription.class);
            intent.putExtra("PlantHeading","Dichondra Emerald Falls");
            intent.putExtra("PlantPhoto", R.drawable.thymus2);
            intent.putExtra("description1","Dichondra Emerald Falls features masses of tiny fan-shaped. emerald green foliage with a low, spreading habit. The plant is evergreen with a trailing habit and is heat tolerant.");
            intent.putExtra("description2","Great for hanging baskets, containers and as a groundcover. Plant in well drained soil in a sunny position. Grows to a height of 5cm and width of 1m.\n This is a relatively low maintenance plant, and can be pruned at anytime. It has no significant negative characteristics.");
            startActivity(intent);
        }else if(position ==4){
            Intent intent = new Intent(this, GroundCoverDescription.class);
            intent.putExtra("PlantHeading","Soleirolia Soleirolii");
            intent.putExtra("PlantPhoto", R.drawable.falls);
            intent.putExtra("description1","Baby's tears (Soleirolia soleirolii) is a mat-forming tropical perennial with myriad tiny leaves. Baby's tears plants are easy to grow for beginners, but they require regular attention to look their best. ");
            intent.putExtra("description2","It thrives in lower-light conditions and is commonly used in terrariums and mixed containers. In warmer climates, it's grown outdoors as an evergreen ground cover or filler plant for rock gardens. \n Despite its reputation for aggressive growth, baby's tears do not respond well to harsh sunlight or dry conditions. But in rich, well-drained, moist soil, the plant sends out runners and spreads throughout the area. ");
            startActivity(intent);
        }else if(position ==5){
            Intent intent = new Intent(this, GroundCoverDescription.class);
            intent.putExtra("PlantHeading","Pratia Rubella Alba");
            intent.putExtra("PlantPhoto", R.drawable.pratia_rubella);
            intent.putExtra("description1","Pratia pedunculata ‘Alba’ features masses of tiny white flowers blooming above a dense carpet of tiny, glossy green leaves. \n Prefers moist conditions, water often during dry periods. Fertilise in Spring to encourage plenty of new growth. Will survive drought and full sun but prefers cooler shadier places to look its best.");
            intent.putExtra("description2","Grows best in moist, well-drained soil with average water. Super Star Creeper makes an excellent, dense groundcover that works well between stepping stones and as under-plantings for shrubs and taller perennials. Tolerates varying amounts of foot traffic.");
            startActivity(intent);
        }else if(position ==6){
            Intent intent = new Intent(this, GroundCoverDescription.class);
            intent.putExtra("PlantHeading","Scleranthus Biflorus");
            intent.putExtra("PlantPhoto", R.drawable.scleranthus);
            intent.putExtra("description1","Scleranthus biflorus, sometimes called a 'moss', but in reality a flowering plant. In general, Scleranthus prefers to be in full sun, but will tolerate a small amount of shade. The soil must be very free-draining, otherwise the winter wet will kill your plant.");
            intent.putExtra("description2","Scleranthus looks spectacular in either containers or in rockery displays as under-planting. \n  Adapts to most soil types. Will tolerate dry spells and frost. It is a good lawn substitute as long as it gets very little traffic- it is lawn look only.");
            startActivity(intent);
        }else if(position ==7){
            Intent intent = new Intent(this, GroundCoverDescription.class);
            intent.putExtra("PlantHeading","Thymus Pulegioides");
            intent.putExtra("PlantPhoto", R.drawable.thymus_poly);
            intent.putExtra("description1","Thymus pulegioides is a small, spreading, evergreen sub shrub, to 25cm tall, with strongly-aromatic, small green leaves and, in early summer, erect spikes of tiny lilac-pink flowers");
            intent.putExtra("description2","Thymus are evergreen woody-based perennials, shrub or sub-shrubs with small aromatic leaves and terminal whorls of small, 2-lipped, tubular, purple, pink or white flowers in late spring or summer. \n Best grown in medium to dry, well-draining, rocky to sandy loams in full sun. Plants grown in rich soils tend to become leggy and have less flavorful leaves. Tolerant of urban conditions and some drought once established");
            startActivity(intent);
        }else if(position ==8){
            Intent intent = new Intent(this, GroundCoverDescription.class);
            intent.putExtra("PlantHeading","Lobelia (Pratia) Angulata");
            intent.putExtra("PlantPhoto", R.drawable.pratia_angulata);
            intent.putExtra("description1","Lobelia angulata, previously known as Pratia angulata, and commonly known as pānakenake, is a small herbaceous scrambling herb native to New Zealand. \n Native white flowering ground cover which thrives in damp shady sites, although will grow in sunny situations. Red berries in autumn are attractive to birds. Dies back in winter in colder climates.");
            intent.putExtra("description2","Great for shady sites, where the white flowers sparkle up from the ground. Keep moist during hotter months, less in winter. ");
            startActivity(intent);
        }else if(position ==9){
            Intent intent = new Intent(this, GroundCoverDescription.class);
            intent.putExtra("PlantHeading","Ficus Pumila (Creeping Fig)");
            intent.putExtra("PlantPhoto", R.drawable.thymus1);
            intent.putExtra("description1","The key to a healthy creeping fig plant is to provide as much warm, humid air as possible, plenty of even moisture, and bright indirect light (but not direct sunlight).");
            intent.putExtra("description2","It's best planted in fall and will grow slowly at first, picking up the pace as it matures. \n Creeping fig plants prefer a bright spot in your home but do not like direct sunlight, which tends to scorch and burn the leaves. In general, you should aim to give your plant six to eight hours of diffused, indirect light each day.");
            startActivity(intent);
        }

        else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}