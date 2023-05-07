package org.designPatterns.behavioral.visitor;

public class MechanicVisitor implements Visitor{
    @Override
    public void visit(BodyElement element) {
        System.out.println("Механник проверил целостность кузова...");
    }

    @Override
    public void visit(EngineElement element) {
        System.out.println("Механник проверил двигатель на неисправности...");
    }
}
