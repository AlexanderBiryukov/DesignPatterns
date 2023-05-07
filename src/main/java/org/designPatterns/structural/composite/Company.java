package org.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Company extends Component {

    List<Component> businessUnits = new ArrayList<>();

    public Company(String name) {
        super(name);
    }

    @Override
    public void addComponent(Component component) {
        businessUnits.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        businessUnits.remove(component);
    }

    @Override
    public List<Component> getComponents() {
        return businessUnits;
    }


    @Override
    public String toString() {
        return name;
    }

    public List<Component> getBusinessUnits() {
        return businessUnits;
    }
}
