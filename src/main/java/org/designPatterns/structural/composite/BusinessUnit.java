package org.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BusinessUnit extends Component {
    List<Component> employees = new ArrayList<>();

    public BusinessUnit(String name) {
        super(name);
    }

    @Override
    public void addComponent(Component component) {
        employees.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        employees.remove(component);
    }

    @Override
    public List<Component> getComponents() {
        return employees;
    }

    @Override
    public String toString() {
        return name;
    }

}
