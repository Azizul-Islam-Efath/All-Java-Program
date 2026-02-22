/*

Polymorphism means "many forms".

It allows one method or object to behave differently depending on the situation.

There are two types:

Compile-time Polymorphism (Method Overloading)

Runtime Polymorphism (Method Overriding)

Example-

*/

package OOP.Quiz_1;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {                  //Method Overriding
        System.out.println("Dog barks");
    }
}
                                    //Method OverLoading
class Cat extends Animal {
    void sound(String name) {
        System.out.println(name+" meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

    Animal a = new Animal();
    a.sound();

    Dog d = new Dog();
    d.sound();

    Cat c = new Cat();
    c.sound("Cat");
    }    
}