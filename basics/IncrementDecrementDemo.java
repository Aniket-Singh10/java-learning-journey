// Program to demonstrate increment and decrement operators in Java
public class IncrementDecrementDemo {

    public static void main(String[] args) {

        // Post-increment and pre-increment demonstration
        int i = 45;

        System.out.println(i++);  // Prints 45, then increments i to 46
        System.out.println(i);    // Prints 46
        System.out.println(++i);  // Increments first, then prints 47
        System.out.println(--i);  // Decrements first, prints 46
        System.out.println(--i);  // Decrements first, prints 45

        // Quick example with multiplication
        int y = 7;
        int x = ++y * 8;          // y becomes 8, then multiplied by 8
        System.out.println("Value of x: " + x);

        // Increment and decrement with character
        char ch = 'a';

        System.out.println(++ch); // b
        System.out.println(--ch); // a
        System.out.println(--ch); // `
        System.out.println(--ch); // _
        System.out.println(--ch); // ^
        System.out.println(--ch); // ]
        System.out.println(--ch); // \
        System.out.println(--ch); // [
        System.out.println(--ch); // Z
        System.out.println(--ch); // Y
    }
}

