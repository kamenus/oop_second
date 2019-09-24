package ru.mirea.practice3;

public abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape() {
        this.color = "black";
        this.filled = false;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    abstract double getArea();

    abstract double getPerimeter();
}
