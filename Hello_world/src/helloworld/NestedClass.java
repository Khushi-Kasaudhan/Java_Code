package helloworld;

public class NestedClass {
    private static String outerStaticField = "Outer static field";

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            // Access static member of outer class
            System.out.println("Accessing from Static Nested Class: " + outerStaticField);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        StaticNestedClass nested = new StaticNestedClass();
        nested.display(); // Outputs: Accessing from Static Nested Class: Outer static field
    }
}
