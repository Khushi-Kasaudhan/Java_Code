package interfaces;

public class Main {
    // Abstract class
    public abstract static class Animal {
        private String name;

        // Constructor
        public Animal(String name) {
            this.name = name;
        }

        // Abstract method
        public abstract void makeSound();

        // Concrete method
        public void sleep() {
            System.out.println(name + " is sleeping.");
        }

        // Getter for name
        public String getName() {
            return name;
        }
    }

    // Concrete subclass of Animal
    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(getName() + " says: Woof Woof!");
        }
    }

    // Concrete subclass of Animal
    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(getName() + " says: Meow!");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        dog.makeSound();  // Outputs: Buddy says: Woof Woof!
        dog.sleep();      // Outputs: Buddy is sleeping.

        Animal cat = new Cat("Whiskers");
        cat.makeSound();  // Outputs: Whiskers says: Meow!
        cat.sleep();      // Outputs: Whiskers is sleeping.
    }
}

