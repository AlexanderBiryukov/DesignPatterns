package org.designPatterns.structural.flyweight;

import java.util.HashMap;

public class FigureFactory {
    private static final HashMap<String, Figure> shapes = new HashMap<>();

    public Figure getFigure(String nameFigure) {
        Figure shape = shapes.get(nameFigure);

        if (shape == null) {
            switch (nameFigure) {
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "triangle":
                    shape =  new Triangle();
                    break;
            }
            shapes.put(nameFigure, shape);
        }
        return shape;
    }

}
