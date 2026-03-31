package com.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testGetMessage() {
        App app = new App();
        assertEquals("Hello from Java CI/CD Pipeline!", app.getMessage());
    }
}
