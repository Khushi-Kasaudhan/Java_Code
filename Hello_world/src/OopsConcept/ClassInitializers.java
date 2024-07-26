package OopsConcept;

//public class ClassInitializers {
//    static int staticVariable;
//
//    static {
//        // Static initializer block
//        staticVariable = 10;
//        System.out.println("Static initializer block executed.");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Static variable value: " + staticVariable);
//    }
//}


public class ClassInitializers {
    int instanceVariable;

    {
        // Instance initializer block
        instanceVariable = 20;
        System.out.println("Instance initializer block executed.");
    }

    public ClassInitializers() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
    	ClassInitializers example = new ClassInitializers();
        System.out.println("Instance variable value: " + example.instanceVariable);
    }
}
