package Lab5;

public class MyWindow implements Movable {
    protected float x;
    protected float y;

    public MyWindow(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void moveTo(float x, float y) {
        this.x = x;
        this.y = y;
        System.out.println(String.format("Перемещено в точку: x=%f y=%f", x, y));
    }
}