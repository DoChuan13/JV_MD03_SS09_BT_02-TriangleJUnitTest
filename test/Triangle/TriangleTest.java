package Triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {
    @Test
    @DisplayName("Equilateral Triangle")
    void testEquilateralTriangle() {
        int side1 = 2, side2 = 2, side3 = 2;
        String expected = "Tam giác đều";
        String result = Triangle.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Isosceles Triangle")
    void testIsoscelesTriangle() {
        int side1 = 2, side2 = 2, side3 = 3;
        String expected = "Tam giác cân";
        String result = Triangle.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Normal Triangle")
    void testNormalTriangle() {
        int side1 = 3, side2 = 4, side3 = 5;
        String expected = "Tam giác thường";
        String result = Triangle.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Invalid Triangle 01")
    void testInvalidTriangle01() {
        int side1 = 8, side2 = 2, side3 = 3;
        String expected = "Không phải là tam giác";
        String result = Triangle.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Invalid Triangle 02")
    void testInvalidTriangle02() {
        int side1 = -1, side2 = 2, side3 = 1;
        String expected = "Không phải là tam giác";
        String result = Triangle.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Invalid Triangle 03")
    void testInvalidTriangle03() {
        int side1 = 0, side2 = 1, side3 = 1;
        String expected = "Không phải là tam giác";
        String result = Triangle.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }
}