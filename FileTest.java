// src/test/java/com/example/compositepattern/FileTest.java
package com.example.compositepattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileTest {

    @Test
    public void testFileCreation() {
        File file = new File("testFile.txt");
        assertEquals("testFile.txt", file.getName());
    }

    @Test
    public void testDisplay() {
        File file = new File("testFile.txt");
        file.display("");
    }
}

