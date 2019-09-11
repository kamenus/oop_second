package com.company;

public class Ball {
    private String color;
    private int weight;
    private int radius;

    public Ball() {
        this.weight = 10;
        this.radius = 1;
        this.color = "blue";
    }

    public Ball(String color, int weight, int radius) {
        this.color = color;
        this.weight = weight;
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", radius=" + radius +
                '}';
    }
}
