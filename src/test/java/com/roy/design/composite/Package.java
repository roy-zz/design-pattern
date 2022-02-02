package com.roy.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Package extends Component {
    public Package(String name) {
        super(name);
    }

    List<Component> children = new ArrayList<>();

    public void addChild(Component child) {
        children.add(child);
    }

    public void removeChild(Component child) {
        children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }

}
