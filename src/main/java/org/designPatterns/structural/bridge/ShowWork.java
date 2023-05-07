package org.designPatterns.structural.bridge;

public class ShowWork {
    public static void main(String[] args) {
        Figure[] figuresForRenderedByMonitor = {new Square(new MonitorRendered()),
                new Circle(new MonitorRendered()), new Triangle(new MonitorRendered())};

        Figure[] figuresForPrintByPrinter = {new Square(new PrinterRendered()),
                new Circle(new PrinterRendered()), new Triangle(new PrinterRendered())};

        // Отрисовка фигур на мониторе
        for (Figure f : figuresForRenderedByMonitor) {
            f.render();
        }

        System.out.println();

        // Распечатка фигур на принтере
        for (Figure f : figuresForPrintByPrinter) {
            f.render();
        }


    }
}
