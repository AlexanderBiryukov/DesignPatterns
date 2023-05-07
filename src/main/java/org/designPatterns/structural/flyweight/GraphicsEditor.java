package org.designPatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

// графический редактор
public class GraphicsEditor {
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();

        List<Figure> figureList = new ArrayList<>();

        figureList.add(factory.getFigure("circle"));
        figureList.add(factory.getFigure("circle"));
        figureList.add(factory.getFigure("circle"));
        figureList.add(factory.getFigure("square"));
        figureList.add(factory.getFigure("square"));
        figureList.add(factory.getFigure("square"));
        figureList.add(factory.getFigure("triangle"));
        figureList.add(factory.getFigure("triangle"));
        figureList.add(factory.getFigure("triangle"));

        System.out.println("Начинаем рисовать: \n");
        for (Figure f : figureList) {
            f.draw();
        }


    }
}
