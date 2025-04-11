package com.mycompany.problem_solve_inher_inter_excep;

public class Main {

    public static void main(String[] args) {
        try {
            Car car = new Car("Sedan", 10.0, 5.0);
            car.displayDetails();
            System.out.println("Car Rental Cost: $" + car.calculaterentalCost());
            System.out.println();

            Bike bike = new Bike("Mountain Bike", 8.0, 3.0);
            bike.displayDetails();
            System.out.println("Bike Rental Cost: $" + bike.calculaterentalCost());
            System.out.println();

// Testing invalid data for Car
            System.out.println("Testing with invalid data:");
                Car invalidCar = new Car("Convertible", 12.0, -4.0);
                System.out.println("Car Rental cost : "+invalidCar.calculaterentalCost());
            } catch (InvalidRentalDataException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                // Testing invalid data for Bike
                Bike invalidBike = new Bike("Road Bike", 15.0, -2.0);
            } catch (InvalidRentalDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
