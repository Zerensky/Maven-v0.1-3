// src/main/java/com/example/compositepattern/Directory.java
package com.example.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    public List<FileSystemComponent> getComponents() {
        return components;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ " + name);
        for (FileSystemComponent component : components) {
            component.display(indent + "  ");
        }
    }
}
