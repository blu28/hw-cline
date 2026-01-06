package com.example.helloworld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Main JavaFX application class.
 * Note: These are basic structure tests since full JavaFX UI testing
 * requires TestFX framework and special headless configuration.
 */
public class MainTest {

    /**
     * Test that the Main class exists and can be loaded.
     */
    @Test
    public void testMainClassExists() {
        // Given - Main class should be available
        Class<?> clazz = Main.class;

        // Then
        assertNotNull(clazz, "Main class should exist");
        assertEquals("Main", clazz.getSimpleName(), "Class name should be Main");
    }

    /**
     * Test that the Main class has the expected package structure.
     */
    @Test
    public void testPackageStructure() {
        // Given
        Package pkg = Main.class.getPackage();

        // Then
        assertNotNull(pkg, "Package should exist");
        assertEquals("com.example.helloworld", pkg.getName(),
                    "Package name should match expected structure");
    }

    /**
     * Test basic class structure properties.
     */
    @Test
    public void testClassStructure() {
        // Given
        Class<?> clazz = Main.class;

        // Then
        assertNotNull(clazz.getDeclaredMethods(), "Should have methods");
        assertTrue(clazz.getDeclaredMethods().length >= 2, "Should have at least start() and main() methods");

        // Check for main method
        boolean hasMainMethod = false;
        for (var method : clazz.getDeclaredMethods()) {
            if ("main".equals(method.getName()) &&
                java.lang.reflect.Modifier.isStatic(method.getModifiers()) &&
                method.getParameterCount() == 1 &&
                method.getParameterTypes()[0].equals(String[].class)) {
                hasMainMethod = true;
                break;
            }
        }
        assertTrue(hasMainMethod, "Should have a main method with String[] args");
    }

    /**
     * Test that the application class extends the correct base class.
     * This test verifies inheritance without requiring JavaFX runtime.
     */
    @Test
    public void testInheritance() {
        // Given
        Class<?> clazz = Main.class;

        // Then
        assertTrue(hasSuperclass(clazz, "javafx.application.Application"),
                  "Main should extend JavaFX Application class");
    }

    /**
     * Helper method to check if a class has a specific superclass in its hierarchy.
     */
    private boolean hasSuperclass(Class<?> clazz, String superclassName) {
        Class<?> current = clazz;
        while (current != null) {
            if (superclassName.equals(current.getName())) {
                return true;
            }
            current = current.getSuperclass();
        }
        return false;
    }
}
