package Lab3;

import java.awt.*;

class Ellipse extends Point {
    protected float r1;
    protected float r2;

    public Ellipse(float x, float y, float r1, float r2, Color color) {
        super(x, y, color);
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Элипс: x=%f y=%f Цвет: %s r1=%f r2=%f", x, y, color, r1, r2));
    }
}
