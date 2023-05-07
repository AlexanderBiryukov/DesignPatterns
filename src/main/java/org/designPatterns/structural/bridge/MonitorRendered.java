package org.designPatterns.structural.bridge;

public class MonitorRendered implements Rendered {

    @Override
    public void renderCircle() {
        System.out.println("Render circle on the monitor...");
    }

    @Override
    public void renderSquare() {
        System.out.println("Render square on the monitor...");
    }

    @Override
    public void renderTriangle() {
        System.out.println("Render triangle on the monitor...");
    }
}
