package org.example4;

import java.util.List;

public class Menu {
    private final List<MenuItem> menuItems;

    public <E> Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem choose(String name) {
        return new MenuItem("돈까스", 5000);
    }
}