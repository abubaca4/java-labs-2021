package Lab3;

import java.awt.*;

class Circle extends Ellipse {
    public Circle(float x, float y, float r, Color color) {
        super(x, y, r, r, color);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Круг: x=%f y=%f Цвет: %s r=%f", x, y, color, r1));
    }
}
