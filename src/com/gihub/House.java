package com.gihub;

public class House {
    private float area;
    private int story;
    private int window;
    private int door;
    private String color;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public House(float area, int story, int window, int door, String color) {
        this.area = area;
        this.story = story;
        this.window = window;
        this.door = door;
        this.color = color;


    }
}
