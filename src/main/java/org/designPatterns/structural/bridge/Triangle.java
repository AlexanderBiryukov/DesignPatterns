package org.designPatterns.structural.bridge;

public class Triangle extends Figure {
    public Triangle(Rendered rendered) {
        super(rendered);
    }

    @Override
    public void render() {
        rendered.renderTriangle();
    }

}
