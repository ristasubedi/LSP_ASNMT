package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {
    ShapeFactory factory = ShapeFactory.getInstance();

    @Test
    void testCircleShapeCreation() {
        Shape shape = factory.getShape("circle");
        assertNotNull(shape);
        assertTrue(shape instanceof Circle);
    }

    @Test
    void testRectangleShapeCreation() {
        Shape shape = factory.getShape("rectangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Rectangle);
    }

    @Test
    void testTriangleShapeCreation() {
        Shape shape = factory.getShape("triangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Triangle);
    }

    @Test
    void testUnknownShape() {
        Shape shape = factory.getShape("hexagon");
        assertNull(shape);
    }
}