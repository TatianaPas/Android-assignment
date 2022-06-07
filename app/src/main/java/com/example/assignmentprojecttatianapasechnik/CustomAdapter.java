package com.example.assignmentprojecttatianapasechnik;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Objects;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{
 private List<ModelClass> plantList;
 private OnItemListener monItemListener;

    public CustomAdapter(List<ModelClass> PLANTLIST, OnItemListener onItemListener) {
        this.plantList = PLANTLIST;
        this.monItemListener=onItemListener;
    }



    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.monsterra, viewGroup, false);
        return new ViewHolder(view, monItemListener);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {

        int img = plantList.get(position).getPlant_image();
        String plant = plantList.get(position).getPlant_name();
        String humidity=plantList.get(position).getText_humidity();
        String flower=plantList.get(position).getText_flower();
        String light =plantList.get(position).getText_light();
        holder.setData(img, plant, humidity, flower, light);
    }

    @Override
    public int getItemCount() {
        return plantList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView plant_image;
        private TextView plant_name;
        private TextView text_humidity;
        private TextView text_flower;
        private TextView text_light;
        OnItemListener onItemListener;

        public ViewHolder(@NonNull View itemView, OnItemListener onItemListener) {
            super(itemView);
            this.plant_image = (itemView).findViewById(R.id.picture);
            this.plant_name = itemView.findViewById(R.id.plant_name);
            this.text_humidity = itemView.findViewById(R.id.humidity);
            this.text_flower = itemView.findViewById(R.id.temperature);
            this.text_light = itemView.findViewById(R.id.light);
            this.onItemListener=onItemListener;

            itemView.setOnClickListener(this);

        }

        public void setData( int img, String plant, String humidity,String temperature, String light )
        {

            plant_image.setImageResource(img);
            plant_name.setText(plant);
            text_humidity.setText(humidity);
            text_light.setText(light);
            text_flower.setText(temperature);
            
        }

        @Override
        public void onClick(View view) {
            onItemListener.onItemClick(getAbsoluteAdapterPosition());

        }
    }

    public interface OnItemListener {
        void onItemClick(int position);
    }

}
