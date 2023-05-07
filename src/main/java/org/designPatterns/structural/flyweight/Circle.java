package org.designPatterns.structural.flyweight;

import javax.crypto.spec.PSource;

public class Circle implements Figure{

    @Override
    public void draw() {
        System.out.println("Рисуем круг..");
    }
}
