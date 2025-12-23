// Program to demonstrate logical operators in Java
public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Logical AND (&&): true only if all conditions are true
        System.out.println("Logical AND (&&) result:");
        if (a && b && c) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        // Logical OR (||): true if at least one condition is true
        System.out.println("Logical OR (||) result:");
        if (a || b || c) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        // Logical NOT (!): reverses the boolean value
        System.out.println("Logical NOT (!) result:");
        if (a != b) {   // equivalent to !(a == b)
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}

