package com.example.assignmentprojecttatianapasechnik;

public class ModelClass {
    private int plant_image;
    private String plant_name;
    private String text_humidity;
    private String text_temperature;
    private String text_light;

    public ModelClass(int plant_image, String plant_name, String text_humidity, String text_temperature, String text_light) {
        this.plant_image = plant_image;
        this.plant_name = plant_name;
        this.text_humidity = text_humidity;
        this.text_temperature = text_temperature;
        this.text_light = text_light;
    }

    public int getPlant_image() {
        return plant_image;
    }

    public String getPlant_name() {
        return plant_name;
    }

    public String getText_humidity() {
        return text_humidity;
    }

    public String getText_temperature() {
        return text_temperature;
    }

    public String getText_light() {
        return text_light;
    }
}
