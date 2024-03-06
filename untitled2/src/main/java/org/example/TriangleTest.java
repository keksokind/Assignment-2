package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", Triangle.getType(1, 1, 1));
        assertEquals("Equilateral", Triangle.getType(200, 200, 200));
        assertEquals("Equilateral", Triangle.getType(100, 100, 100));
        assertEquals("Equilateral", Triangle.getType(2, 2, 2));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", Triangle.getType(3, 3, 2));
        assertEquals("Isosceles", Triangle.getType(200, 200, 199));
        assertEquals("Isosceles", Triangle.getType(100, 100, 80));
        assertEquals("Isosceles", Triangle.getType(1, 1, 2));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", Triangle.getType(3, 4, 5));
        assertEquals("Scalene", Triangle.getType(199, 198, 197));
        assertEquals("Scalene", Triangle.getType(100, 80, 90));
        assertEquals("Scalene", Triangle.getType(2, 3, 4));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", Triangle.getType(1, 2, 3));
        assertEquals("NotATriangle", Triangle.getType(200, 1, 1));
        assertEquals("NotATriangle", Triangle.getType(100, 20, 10));
        assertEquals("NotATriangle", Triangle.getType(1, 199, 1));
    }

    @Test
    public void testInvalidInputs() {
        assertEquals("Value of a is not in the range of permitted values.", Triangle.getType(0, 1, 1));
        assertEquals("Value of b is not in the range of permitted values.", Triangle.getType(1, 0, 1));
        assertEquals("Value of c is not in the range of permitted values.", Triangle.getType(1, 1, 0));
        assertEquals("Value of a is not in the range of permitted values.", Triangle.getType(201, 1, 1));
        assertEquals("Value of b is not in the range of permitted values.", Triangle.getType(1, 201, 1));
        assertEquals("Value of c is not in the range of permitted values.", Triangle.getType(1, 1, 201));
    }
}
