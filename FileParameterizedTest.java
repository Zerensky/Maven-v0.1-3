// src/test/java/com/example/compositepattern/FileParameterizedTest.java
package com.example.compositepattern;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"file1.txt", "file2.txt", "file3.txt"})
    public void testFileCreationWithDifferentNames(String name) {
        File file = new File(name);
        assertEquals(name, file.getName());
    }
}

