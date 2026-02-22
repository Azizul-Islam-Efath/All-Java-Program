/*
Abstraction is an Object-Oriented Programming (OOP) concept where,
we hide implementation details and show only the essential features of an object.
*/

package OOP.Quiz_1_2;

// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass
class Dog extends Animal {
    // Providing implementation
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Abstraction {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
        obj.sleep();
    }
}
