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
        succulentssList.add(new ModelClassSucculent(R.drawable.craccula, "Crassula", "Species: Crassulaceae", "Green"));
        succulentssList.add(new ModelClassSucculent(R.drawable.echeveria3, "Elegance", "Species: Echeveria", "Green"));
        succulentssList.add(new ModelClassSucculent(R.drawable.hawortia_dark1, "Black Zebra", "Species: Haworthia", "Black and White"));
        succulentssList.add(new ModelClassSucculent(R.drawable.sedum, "Stonecrop", "Species: Sedum", "Green/Blue-gray"));
        succulentssList.add(new ModelClassSucculent(R.drawable.green_zebra, "Zebra Plant", "Species: Haworthia", "Green and White"));
        succulentssList.add(new ModelClassSucculent(R.drawable.graptoviera_debbie, "Debbie", "Species: Graptoveria", "Purple"));
        succulentssList.add(new ModelClassSucculent(R.drawable.jade_small, "Jade plant", "Species: Crassulaceae", "Green"));
        succulentssList.add(new ModelClassSucculent(R.drawable.calanchoe_pink, "Kalanchoe", "Species: Crassulaceae", "Green"));
        succulentssList.add(new ModelClassSucculent(R.drawable.succulent_dark, "Chroma", "Species: Echeveria", "Brown"));
        succulentssList.add(new ModelClassSucculent(R.drawable.green_succulent, "Agavoides", "Species: Echeveria", "Green"));


    }
    public void onItemClick(int position) {
        if (position==0)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Crassula");
            intent.putExtra("photo", R.drawable.craccula);
            intent.putExtra("description1","Crassula hard to kill and easy to propagate from cuttings. Even a single leaf that falls from the plant will often take root in potting mix. However, don't completely neglect your plant—it still needs water.");
            intent.putExtra("description2","Crassula can be sensitive to temperature. If the plants are too hot, they will go dormant and drop their lower leaves. If the plants are too cold, they will fail to grow or thrive. Other than that, they tend to tolerate neglect just fine. With all species, you can aggressively cut the plants back whenever they get straggly or leggy.");
            startActivity(intent);
        }else if (position==1)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Echeveria Elegance");
            intent.putExtra("photo", R.drawable.echeveria3);
            intent.putExtra("description1","Echeveria Elegans “Mexican Snowball” are low-growing succulent plants that grow in compressed, blue-green mounds. They have pink flowers with tints of yellow in them, and the tips of the leaves are pink.");
            intent.putExtra("description2","Just like other succulents, water them when their soil dries out, during the spring and summer.  Don’t water Mexican snowballs during the winter. The plant can experience soft and root rot; and can also attract mealy bugs. \n Generally, Mexican Snowballs do not require fertilizer; however, depending on the health of the soil, some additional nutrients may be beneficial. If you are adding fertilizer, however, don’t overdo it; adding too many nutrients can be detrimental to the plant.");
            startActivity(intent);
        }
        else if (position==2)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Haworthia Black Zebra");
            intent.putExtra("photo", R.drawable.black_zebra);
            intent.putExtra("description1","Black zebra plant leaves tend to take a triangular shape. They would usually flower during summer. Those blooms would form on long stem edges.  Black zebra plants can produce offsets. \n Unlike any other succulents, Zebra plants do well even in medium and low light conditions, which is usually found in an indoor setting. But if you want to bring out its stunning red and orange pigments, display them in a spot where they can get as much natural light as possible, like a south or east-facing windowsill.");
            intent.putExtra("description2","Water every 2-3 weeks in direct light, allowing soil to dry out between waterings. Expect to water more often in brighter light and less often in lower light.");
            startActivity(intent);
        }
        else if (position==3)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Stonecrop Sedum");
            intent.putExtra("photo", R.drawable.sedum);
            intent.putExtra("description1","The majority of sedum species can grow properly in moist and fertile soil when located in a sunny position. These plants are very drought tolerant These plants can grow well in light shade and even dry positions.");
            intent.putExtra("description2","While it can tolerate shade, the best spot for it to properly grow is a sunny spot. However, it might require protection in too much sun as it’s not heat-tolerant. \n The plants need well-drained soil that is rich in organic amendments. Young plants should be watered every few days while establishing but irrigation can diminish thereafter and no supplemental water is needed in fall and winter. If planting in containers, use pots that are unglazed clay to promote evaporation of excess water. Overwatering is the most common cause of problems in stonecrop." );
            startActivity(intent);
        }
        else if (position==4)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Haworthia Zebra Plant");
            intent.putExtra("photo", R.drawable.zebra_green);
            intent.putExtra("description1","Haworthia Fasciata 'Zebra Haworthia is one of the most popular Haworthia species. Its leaves are thin, and dark green with horizontal white ridges that resemble zebra striping.");
            intent.putExtra("description2","Haworthia species like bright light but not exceptionally strong direct sunlight. In their native environment, they are often found in the slight shade of a rock or other object. They can tolerate direct morning sun, but harsh afternoon rays can burn their foliage. This zebra plant is a tropical species that loves humidity. ");
            startActivity(intent);
        }
        else if (position==5)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Graptoveria Debbie");
            intent.putExtra("photo", R.drawable.graptoviera_debbie);
            intent.putExtra("description2","Debbie, like her sister, ‘Bashful,’ is one of many spreading, low-level purple succulents that loves the heat and full sun of a warm-climate garden. Growing up to 20cm tall, Debbie s a darker hue, ranging from pale green tinged with lilac through to dark eggplant as the season progresses. Both these succulents are animal- friendly and non-toxic.");
            intent.putExtra("description1","Graptoveria ‘Debbie’ is an Echeveria hybrid with beautiful rosettes of fleshy gray-purple leaves. The tips of these leaves can turn into a vibrant pink color when stressed. Graptoveria ‘Debbie’ offsets readily to for a dense clump.\n");
            startActivity(intent);
        }
        else if (position==6)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Jade plant");
            intent.putExtra("photo", R.drawable.sunset_jade);
            intent.putExtra("description1","Jade plants adapt well to the warm, dry conditions found in most homes. It’s important to keep the plant watered during the growing season (spring, summer) and drier during the dormant season (fall, winter). However, even during the growing season, the soil should be allowed to dry out fully between waterings, as jade is very susceptible to rot.");
            intent.putExtra("description2","Jade plants should receive at least 6 hours of bright light each day. Young plants should be kept in bright, indirect sunlight; large, well-established jade plants can handle more direct sunlight.");
            startActivity(intent);
        }
        else if (position==7)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Kalanchoe");
            intent.putExtra("photo", R.drawable.calanchoe_yellow);
            intent.putExtra("description1","The popular kalanchoe is a tropical and sub-tropical perennial that grows to around 30cm in height. In cool climates it’s usually treated as an annual because it doesn’t like cold weather.");
            intent.putExtra("description2","Being a succulent, kalanchoe prefers a light, sandy or gritty soil that drains freely—it does not like “wet feet”. When growing kalanchoe in the garden, work some coarse washed river sand through heavier loam or clay soils to “open” it up and improve drainage. In pots and baskets, use a premium-quality cacti and succulent potting mix.");
            startActivity(intent);
        }
        else if (position==8)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Echeveria Chroma");
            intent.putExtra("photo", R.drawable.succulent_dark);
            intent.putExtra("description1","Chroma is an exciting variety with shiny, dark purple-bronze leaves that look almost metallic. It has the best coloring during the winter. During the summer grow it in partial shade and water regularly to keep it looking its best");
            intent.putExtra("description2"," All echeveria can withstand fairly cold temperatures if the soil they are planted in is dry and there isn't any water on the leaves. Frequent rain and cold on their leaves will cause rot and disease. \n Echeveria ‘Chroma' will produce small offsets, sprouting up around the base of the plant. Simply pull these up and allow the offsets to dry for one to two days before replanting.");
            startActivity(intent);
        }
        else if (position==9)
        {
            Intent intent = new Intent(this, SuculentDescription.class);
            intent.putExtra("plantName","Echeveria Agavoides");
            intent.putExtra("photo", R.drawable.green_succulent);
            intent.putExtra("description1","Echeveria agavoides is also commonly known as the ‘Lipstick Echeveria’. As the plant matures you can expect it to reach around 12.5 cm tall and about 20 cm in diameter.\n The plant has beautiful green to matt green leaves that turns slightly red in full sun. When it flowers you can expect to produce pinkish-red to orange flowers.");
            intent.putExtra("description2","It should not sit on the water, and an excess amount of water should be avoided. The best way of watering is soak and dry method this succulent.");
            startActivity(intent);
        }

        else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        }


}