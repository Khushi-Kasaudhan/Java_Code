package stringsPackage;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Length of the string
        System.out.println("Length: " + str.length()); // Outputs: Length: 13

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase()); // Outputs: Uppercase: HELLO, WORLD!

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase()); // Outputs: Lowercase: hello, world!

        // Trim whitespace
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'"); // Outputs: 'Hello, World!'

        // Check if string contains a substring
        System.out.println("Contains 'World': " + str.contains("World")); // Outputs: true

        // Check if string starts with a substring
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello")); // Outputs: true

        // Check if string ends with a substring
        System.out.println("Ends with 'World!': " + str.endsWith("World!")); // Outputs: true

        // Get character at a specific index
        System.out.println("Character at index 7: " + str.charAt(7)); // Outputs: W

        // Find the index of a substring
        System.out.println("Index of 'World': " + str.indexOf("World")); // Outputs: 7

        // Find the last index of a substring
        System.out.println("Last index of 'o': " + str.lastIndexOf('o')); // Outputs: 8

        // Replace a substring with another string
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java")); // Outputs: Hello, Java!

        // Split the string into an array of substrings
        String[] words = str.split(", ");
        System.out.println("Split result: ");
        for (String word : words) {
            System.out.println(word); // Outputs: Hello\nWorld!
        }

        // Check if string is empty
        System.out.println("Is empty: " + str.isEmpty()); // Outputs: false

        // Concatenate strings
        String str2 = "Java Programming";
        System.out.println("Concatenated: " + str.concat(" - " + str2)); // Outputs: Hello, World! - Java Programming

        // Convert string to a character array
        char[] charArray = str.toCharArray();
        System.out.println("Character array: ");
        for (char ch : charArray) {
            System.out.print(ch + " "); // Outputs: H e l l o ,   W o r l d ! 
        }
        System.out.println();

        // Substring extraction
        System.out.println("Substring (7, 12): " + str.substring(7, 12)); // Outputs: World

        // Check if string equals another string
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!")); // Outputs: true


     
    }
}

