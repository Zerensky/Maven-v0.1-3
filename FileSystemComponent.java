// src/main/java/com/example/compositepattern/FileSystemComponent.java
package com.example.compositepattern;

public abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public abstract void display(String indent);

    public String getName() {
        return name;
    }
}
