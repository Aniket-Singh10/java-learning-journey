// Program to demonstrate operator precedence and associativity in Java
public class PrecedenceAndAssociativity {

    public static void main(String[] args) {

        /*
         * Example 1: Operator precedence
         * Expression: (5 + 9) * 3 - 45 % 4
         *
         * Step-by-step:
         * (5 + 9) = 14
         * 14 * 3 = 42
         * 45 % 4 = 1
         * 42 - 1 = 41
         */
        int a = (5 + 9) * 3 - 45 % 4;
        System.out.println("Result of precedence example: " + a);

        /*
         * Example 2: Associativity
         * Operators *, / have same precedence
         * They follow Left-to-Right associativity
         *
         * Expression: 60 / 5 - 30 * 2
         *
         * Step-by-step:
         * 60 / 5 = 12
         * 30 * 2 = 60
         * 12 - 60 = -48
         */
        int b = 60 / 5 - 30 * 2;
        System.out.println("Result of associativity example: " + b);
    }
}
