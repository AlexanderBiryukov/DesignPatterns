package org.designPatterns.structural.flyweight;

public class Triangle implements Figure{
    @Override
    public void draw() {
        System.out.println("Рисуем треугольник..");
    }
}
