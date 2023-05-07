package org.designPatterns.structural.bridge;

public abstract class Figure {
    protected Rendered rendered;

    public Figure(Rendered rendered) {
        this.rendered = rendered;
    }

    public abstract void render();

}
