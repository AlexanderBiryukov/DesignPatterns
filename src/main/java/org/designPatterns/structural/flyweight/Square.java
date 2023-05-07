package org.designPatterns.structural.flyweight;

public class Square implements Figure{
    @Override
    public void draw() {
        System.out.println("Рисуем квадрат..");
    }
}
