// src/main/java/com/example/compositepattern/File.java
package com.example.compositepattern;

public class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- " + name);
    }
}
