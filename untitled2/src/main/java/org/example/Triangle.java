package org.example;

public class Triangle {
    public static String getType(int a, int b, int c) {
        if (!isValidInput(a, b, c)) {
            return "Invalid input";
        }

        if (!isTriangle(a, b, c)) {
            return "NotATriangle";
        }

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    private static boolean isValidInput(int a, int b, int c) {
        return (a >= 1 && a <= 200) && (b >= 1 && b <= 200) && (c >= 1 && c <= 200);
    }

    private static boolean isTriangle(int a, int b, int c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}
