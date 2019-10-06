package ru.mirea.practice3;

public class Square extends Rectangle{
    private double side;

    public Square() {
        super();
        this.side = 1;
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public Square(double side) {
        super("black", false, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
