package org.designPatterns.structural.bridge;

public class Square extends Figure {
    public Square(Rendered rendered) {
        super(rendered);
    }

    @Override
    public void render() {
        rendered.renderSquare();
    }

}
