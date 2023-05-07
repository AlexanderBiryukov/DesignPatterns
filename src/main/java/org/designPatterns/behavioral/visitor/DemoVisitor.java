package org.designPatterns.behavioral.visitor;

public class DemoVisitor {
    public static void main(String[] args) {
        MechanicVisitor mechanicVisitor = new MechanicVisitor();
        SalesManagerVisitor salesManagerVisitor = new SalesManagerVisitor();

        BodyElement bodyElement = new BodyElement();
        EngineElement engineElement = new EngineElement();

        bodyElement.accept(mechanicVisitor);
        engineElement.accept(mechanicVisitor);
        System.out.println();
        bodyElement.accept(salesManagerVisitor);
        engineElement.accept(salesManagerVisitor);


    }
}
