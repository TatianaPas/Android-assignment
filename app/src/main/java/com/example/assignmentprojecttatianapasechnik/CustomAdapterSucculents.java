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

public class CustomAdapterSucculents extends RecyclerView.Adapter<CustomAdapterSucculents.ViewHolder>{
    private List<ModelClassSucculent> succulentList;
    private OnItemListener monItemListener;

    public CustomAdapterSucculents(List<ModelClassSucculent> PLANTLISTS, OnItemListener onItemListener) {
        this.succulentList = PLANTLISTS;
        this.monItemListener=onItemListener;
    }



    @Override
    public CustomAdapterSucculents.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.echeveria, viewGroup, false);
        return new ViewHolder(view, monItemListener);
    }

    @Override
    public void onBindViewHolder(CustomAdapterSucculents.ViewHolder holder, int position) {

        int img = succulentList.get(position).getPlant_image();
        String plant = succulentList.get(position).getPlant_name();
        String species=succulentList.get(position).getText_species();
        String color=succulentList.get(position).getText_color();
        holder.setData(img, plant,species,color);
    }

    @Override
    public int getItemCount() {
        return succulentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView plant_image;
        private TextView plant_name;
        private TextView text_species;
        private TextView text_color;
        OnItemListener onItemListener;

        public ViewHolder(@NonNull View itemView, OnItemListener onItemListener) {
            super(itemView);
            this.plant_image = (itemView).findViewById(R.id.succulent_picture);
            this.plant_name = itemView.findViewById(R.id.succulent_name);
            this.text_species = itemView.findViewById(R.id.species_text);
            this.text_color = itemView.findViewById(R.id.color_text);
            this.onItemListener=onItemListener;

            itemView.setOnClickListener(this);

        }

        public void setData( int img, String plant, String species, String color )
        {
            plant_image.setImageResource(img);
            plant_name.setText(plant);
            text_species.setText(species);
            text_color.setText(color);

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

