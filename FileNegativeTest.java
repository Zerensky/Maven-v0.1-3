// src/test/java/com/example/compositepattern/FileNegativeTest.java
package com.example.compositepattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileNegativeTest {

    @Test
    public void testNullFileName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new File(null);
        });
    }
}

