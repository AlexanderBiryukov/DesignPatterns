package org.designPatterns.structural.bridge;

public class PrinterRendered implements Rendered {

    @Override
    public void renderCircle() {
        System.out.println("Print circle on a printer...");
    }

    @Override
    public void renderSquare() {
        System.out.println("Print square on a printer...");
    }

    @Override
    public void renderTriangle() {
        System.out.println("Print triangle on a printer...");
    }
}
