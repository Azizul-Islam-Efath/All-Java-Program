package com.mycompany.problem_solve_inher_inter_excep;

public class Car extends Vehicle implements Rentable {
    
    double Rental_duration;
    Car(String  vehicle_name,double baseRate,double Rental_duration){
    this.Rental_duration=Rental_duration;
    this.baseRate=baseRate;
    this.vehicle_name=vehicle_name;  
    
    }
    
    
   
     
    
    
    
    
    
    
    
    public void displayDetails(){
         System.out.println(vehicle_name);
        System.out.println(baseRate);
        System.out.println(Rental_duration);
    }

   public double calculaterentalCost() throws InvalidRentalDataException {
    if(Rental_duration<0)
    {
    throw new InvalidRentalDataException("Rental Duration Cannot be negative.");
    }
    return baseRate*Rental_duration;
    
    
    }
    
}
