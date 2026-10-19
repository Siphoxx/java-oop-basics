class Dog {
    // Fields
    String name;
    int age;

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void bark() {
        System.out.println(name + " says Woof!");
    }
}

public class Main {
    public static void main(String[] args) {

        // Create the Object
        Dog myDog = new Dog("Buddy", 3);

        // Print the fields
        System.out.println("My dog's name is: " + myDog.name);
        System.out.println("My dog's age is: " + myDog.age);

        // Call the method
        myDog.bark();
    }
}