// Program to demonstrate various String methods in Java
public class StringMethodsDemo {

    public static void main(String[] args) {

        String a = "Aniket is a Good Boy";
        System.out.println("Original String: " + a);

        // 1. Length of string
        int length = a.length();
        System.out.println("Length: " + length);

        // 2. Convert to lowercase
        System.out.println("Lowercase: " + a.toLowerCase());

        // 3. Convert to uppercase
        System.out.println("Uppercase: " + a.toUpperCase());

        // 4. Trim leading and trailing spaces
        String nonTrimString = "   Ansh   ";
        System.out.println("Trimmed string: '" + nonTrimString.trim() + "'");

        // 5. Substring from index (start inclusive, end exclusive)
        System.out.println("Substring (4, 15): " + a.substring(4, 15));

        // 6. Replace characters and strings
        System.out.println("Replace 'i' with 'k': " + a.replace('i', 'k'));
        System.out.println("Replace word: " + a.replace("Aniket", "Nitin"));

        // 7. Starts with / Ends with
        System.out.println("Starts with 'Ani': " + a.startsWith("Ani"));
        System.out.println("Ends with 'Boy': " + a.endsWith("Boy"));

        // 8. Character at given index
        System.out.println("Character at index 8: " + a.charAt(8));

        // 9. Index of substring
        System.out.println("Index of 'ket': " + a.indexOf("ket"));
        System.out.println("Index of 'iket is' from index 5: " + a.indexOf("iket is", 5));

        // 10. Last index of substring
        System.out.println("Last index of 'od': " + a.lastIndexOf("od"));

        // 11. String comparison
        String b = "Arambh HAI prachand";
        System.out.println("Equals check: " + b.equals("hai"));
        System.out.println("Exact equals: " + b.equals("Arambh HAI prachand"));
        System.out.println("Equals ignore case: " + b.equalsIgnoreCase("arambh hai prachand"));

        // 12. Escape sequence characters
        System.out.println("Hello I am \"Aniket\"");
        System.out.println("Hello I am\n\"Aniket\"");
        System.out.println("Hello I\nam\n\t\"Aniket\"");
    }
}

