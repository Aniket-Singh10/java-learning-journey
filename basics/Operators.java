// Program to demonstrate different types of operators in Java
public class Operators {

    public static void main(String[] args) {

        // 1. Arithmetic Operators: +, -, *, /, %, ++, --
        int a = 4;
        int b = 45 * a;
        System.out.println("Multiplication result: " + b);

        int x = 4;
        int y = 34 % x;   // Modulo operator
        System.out.println("Modulo result: " + y);

        // 2. Assignment Operators: =, +=, -=, *=, /=
        int c = 3;
        c *= 10;          // c = c * 10
        System.out.println("Assignment operator result: " + c);

        // 3. Comparison Operators: ==, <, >, <=, >=
        boolean comparisonResult = (55 < 10);
        System.out.println("Comparison result (55 < 10): " + comparisonResult);

        // 4. Logical Operators: &&, ||, !
        // Using variables to avoid dead code and improve readability
        boolean logicalResult = (55 > 5 || 55 > 25) && (55 < 9);
        System.out.println("Logical operator result: " + logicalResult);

        // 5. Bitwise Operators: &, |
        int bitwiseResult = 2 & 5;
        System.out.println("Bitwise AND result: " + bitwiseResult);
    }
}

