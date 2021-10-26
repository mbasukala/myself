package com.gihub;

public class House {
    private int area;
    private int story;
    private int window;
    private int door;
    private String color;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public House(int area, int story, int window, int door, String color) {
        this.area = area;
        this.story = story;
        this.window = window;
        this.door = door;
        this.color = color;


    }
}
