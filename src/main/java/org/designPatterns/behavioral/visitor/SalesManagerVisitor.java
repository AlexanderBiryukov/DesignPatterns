package org.designPatterns.behavioral.visitor;

public class SalesManagerVisitor implements Visitor{
    @Override
    public void visit(BodyElement element) {
        System.out.println("Менеджер продал кузовную запчасть..");
    }

    @Override
    public void visit(EngineElement element) {
        System.out.println("Менеджер продал двигатель...");
    }
}
