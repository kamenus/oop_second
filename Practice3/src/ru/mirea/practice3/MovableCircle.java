package ru.mirea.practice3;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void MoveDown() {
        super.MoveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                ", x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
