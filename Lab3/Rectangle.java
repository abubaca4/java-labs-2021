package Lab3;

import java.awt.*;

class Rectangle extends Point {
    protected float w;
    protected float h;

    @Override
    public void draw() {
        System.out.println(String.format("Точка: x=%f y=%f w=%f h=%f Цвет: %s", x, y, w, h, color));
    }

    public Rectangle(float x, float y, float w, float h, Color color) {
        super(x, y, color);
        this.h = h;
        this.w = w;
    }
}
