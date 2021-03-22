package ru.novsu.povt.kis.graphics;

import java.awt.*;

public class Background extends Graph {
    protected Color color;
    protected String name;

    public Background(Color color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Фон: Цвет: %s Имя текстуры: %s", color, name));
    }
}
