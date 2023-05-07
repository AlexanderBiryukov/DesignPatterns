package org.designPatterns.structural.composite;

import java.util.List;

public class Employee extends Component {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void addComponent(Component component) {
        // метод не используется
    }

    @Override
    public void removeComponent(Component component) {
        // метод не используется
    }

    @Override
    public List<Component> getComponents() {
        // метод не используется
        return null;
    }

    @Override
    public String toString() {
        return name;
    }


}
