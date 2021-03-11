package SecondLab;

import java.awt.*;

public class GraphicalPrimitives {
    public static void main(String[] args) {
        Graph test1 = new Point(10, 20, Color.black);
        test1.draw();
        Graph test2 = new Rectangle(2, 5, 3, 4, Color.blue);
        test2.draw();
        Graph test3 = new Background(Color.white, "test3");
        test3.draw();
        Graph test4 = new Ellipse(3, 4, 7, 11, Color.ORANGE);
        test4.draw();
        Graph test5 = new Circle(1, 3, 5, Color.GREEN);
        test5.draw();
    }
}