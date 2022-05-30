package com.example.assignmentprojecttatianapasechnik;

public class ModelClassSucculent {
    private int plant_image;
    private String plant_name;
    private String text_species;
    private String text_color;

    public ModelClassSucculent(int plant_image, String plant_name, String text_species, String text_color) {
        this.plant_image = plant_image;
        this.plant_name = plant_name;
        this.text_species=text_species;
        this.text_color=text_color;
    }

    public int getPlant_image() {
        return plant_image;
    }

    public String getPlant_name() {
        return plant_name;
    }

    public String getText_species() {
        return text_species;
    }

    public String getText_color() {
        return text_color;
    }
}