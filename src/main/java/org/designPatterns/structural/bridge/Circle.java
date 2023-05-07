package org.designPatterns.structural.bridge;

public class Circle extends Figure {
    public Circle(Rendered rendered) {
        super(rendered);
    }

    @Override
    public void render() {
        rendered.renderCircle();
    }
}
