package org.designPatterns.structural.composite;

import java.util.List;

abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void addComponent(Component component);

    public abstract void removeComponent(Component component);
    public abstract List<Component> getComponents();

    public abstract String toString();
}
