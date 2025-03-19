package Projects;

class Car {

    String brand;
    String model;
    double price;
    int year;

    public Car(String brand, String model, double price, int year) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
    }
}

public class CarShowRoom {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 25000, 2022);
        Car car2 = new Car("Tesla", "Model S", 75000, 2023);
        System.out.println("Car Details: ");
        car1.display();
        car2.display();
        System.out.println("The most Expensive Car");
        if (car1.price > car2.price) {
            car1.display();
        } else if (car2.price > car1.price) {
            car2.display();
        } else {
            System.out.println("Invalid");
        }
    }
}