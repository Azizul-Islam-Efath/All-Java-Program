/*
Inheritance allows one class to acquire the properties and methods of another class. 
*/

package OOP.Quiz_1_1;

public class Inheritance {
    void eat(){
        System.out.println("Dog Can Eat.");
    }    
}

class Cat extends Inheritance{
    void walk(){
        System.out.println("Dog can walk.");
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();                        //inherited method
        c.walk();
    }
}
