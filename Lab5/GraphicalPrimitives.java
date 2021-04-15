package Lab5;

import java.awt.*;

public class GraphicalPrimitives {
    static void swapXY(Movable object) {
        if (object == null)
            throw new NullPointerException("Object is not created");
        System.out.println(String.format("Перемещено x=%f y=%f > x=%f y=%f", object.getX(), object.getY(),
                object.getY(), object.getX()));
        object.moveTo(object.getY(), object.getX());
    }

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
        Movable data[] = { new MyWindow(5, 7), (Movable) test1, null, (Movable) test5 };
        for (Movable i : data) {
            try {
                swapXY(i);
            } catch (NullPointerException ex) {
                System.out.println("Error while swapping coordinates.");
                ex.printStackTrace();
            }
        }
    }
}