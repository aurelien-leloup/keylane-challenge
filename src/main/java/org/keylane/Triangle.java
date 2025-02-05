package org.keylane;

/**
 * A triangle is a polygon with three sides.
 *
 * @author aurel
 * @since 2025-02-05
 */
public class Triangle {

    private final double side1;
    private final double side2;
    private final double side3;

    /**
     * The type of triangle.
     */
    public enum TriangleType {
        EQUILATERAL,
        ISOSCELES,
        SCALENE
    }

    /**
     * Create a triangle with the given sides.
     *
     * @param side1 the length of the first side
     * @param side2 the length of the second side
     * @param side3 the length of the third side
     * @throws IllegalArgumentException if the sides do not form a valid triangle
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (!isValidTriangle()) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
    }

    /**
     * Get the type of the triangle.
     *
     * @return the type of the triangle
     */
    public TriangleType getType() {
        if (side1 == side2 && side2 == side3) {
            return TriangleType.EQUILATERAL;
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }

    /**
     * Check if the sides form a valid triangle.
     *
     * @return true if the sides form a valid triangle
     */
    private boolean isValidTriangle() {
        return side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1;
    }


}
