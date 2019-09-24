package ru.mirea.practice3;

public class Square extends Rectangle{
    protected double side;

    public Square() {
        super();
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }


}
