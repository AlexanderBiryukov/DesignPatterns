package org.designPatterns.behavioral.visitor;

public interface Visitor {
    public void visit(BodyElement element);
    public void visit(EngineElement element);
}
