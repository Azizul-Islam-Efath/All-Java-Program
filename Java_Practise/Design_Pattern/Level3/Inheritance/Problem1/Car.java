package Level3.Inheritance.Problem1;

public class Car extends Vehicle{

    void Display(){
        System.out.println("I am inside the Car class.");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        c.Display();
    }

    
}
class Vehicle {
    public void display(){
    System.out.println("I am Inside The Vehicle Class");
    }
}