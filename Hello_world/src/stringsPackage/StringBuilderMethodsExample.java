package stringsPackage;


public class StringBuilderMethodsExample {
    public static void main(String[] args) {
        // Create a StringBuilder instance
        StringBuilder sb = new StringBuilder("Hello");

        // Append methods
        sb.append(" World");
        System.out.println("Append: " + sb); // Outputs: Hello World

        // Insert methods
        sb.insert(5, ",");
        System.out.println("Insert: " + sb); // Outputs: Hello, World

        // Replace methods
        sb.replace(6, 11, "Java");
        System.out.println("Replace: " + sb); // Outputs: Hello, Java

        // Delete methods
        sb.delete(5, 6);
        System.out.println("Delete: " + sb); // Outputs: HelloJava

        // Delete character at specific index
        sb.deleteCharAt(5);
        System.out.println("Delete char at index 5: " + sb); // Outputs: Helloava

        // Reverse methods
        sb.reverse();
        System.out.println("Reverse: " + sb); // Outputs: avolleH

        // Convert to String
        String str = sb.toString();
        System.out.println("To String: " + str); // Outputs: avolleH
        
        System.out.println("Length: " + sb.length()); // Outputs: 7

  
    }
}

