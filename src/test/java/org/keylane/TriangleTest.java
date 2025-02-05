package org.keylane;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author aurel
 * @since 2025-02-05
 */
class TriangleTest {

    @Test
    void invalidTriangle_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 3));
    }

    @Test
    void anySideZero_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 2, 3));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 0, 3));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 0));
    }

    @Test
    void negativeSide_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-1, 2, 3));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, -2, 3));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, -3));
    }

    @Test
    void equilateralTriangle_shouldReturnEquilateral() {
        Triangle triangle = new Triangle(2, 2, 2);
        assertEquals(Triangle.TriangleType.EQUILATERAL, triangle.getType());
    }

    @Test
    void isoscelesTriangle_shouldReturnIsosceles() {
        Triangle triangle = new Triangle(2, 2, 3);
        assertEquals(Triangle.TriangleType.ISOSCELES, triangle.getType());
    }

    @Test
    void scaleneTriangle_shouldReturnScalene() {
        Triangle triangle = new Triangle(2, 3, 4);
        assertEquals(Triangle.TriangleType.SCALENE, triangle.getType());
    }

}
