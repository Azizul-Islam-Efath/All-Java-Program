package Level3.Overloading_Overriding;

public class Animal {
    void display(){
        System.out.println("This is an animal");
    }

}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barks .");
    }
}
class Cat extends Dog{
    void makeSound(){
        System.out.println("Cat Meows .");
    }

    public static void main(String[] args) {
        Cat c = new Cat();

        c.display();
        c.makeSound();

        Dog d = new Dog();
        d.display();
        d.makeSound();
    }
}
