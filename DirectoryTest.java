// src/test/java/com/example/compositepattern/DirectoryTest.java
package com.example.compositepattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectoryTest {
    private Directory root;
    private File file1;
    private File file2;
    private Directory subDir;

    @BeforeEach
    public void setup() {
        root = new Directory("root");
        file1 = new File("file1.txt");
        file2 = new File("file2.txt");
        subDir = new Directory("subDir");
    }

    @Test
    public void testAddComponent() {
        root.addComponent(file1);
        root.addComponent(file2);
        root.addComponent(subDir);
        assertEquals(3, root.getComponents().size());
    }

    @Test
    public void testDisplay() {
        root.addComponent(file1);
        root.addComponent(subDir);
        subDir.addComponent(file2);
        root.display("");
    }
}

