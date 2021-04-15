package Lab5;

import java.awt.*;

class Point extends Graph implements Movable {
    protected float x;
    protected float y;
    protected Color color;

    public void draw() {
        System.out.println(String.format("Точка: x=%f y=%f Цвет: %s", x, y, color));
    }

    public Point(float x, float y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void moveTo(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
