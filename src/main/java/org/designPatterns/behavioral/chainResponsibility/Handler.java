package org.designPatterns.behavioral.chainResponsibility;

public abstract class Handler {
    private Handler next;

    public Handler setNexthandler(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String name, String password);

    protected boolean handleNext(String name, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(name, password);
    }

}
