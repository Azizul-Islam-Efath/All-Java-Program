package com.mycompany.exception_handling;

import java.util.Scanner;

// Custom exception should extend Exception, not your main class

public class Exception_handling {

    public static void main(String[] args) {

        String s = null;
        int x = 10;
        int arr[] = {1, 2, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value you want to divide by:");
        int y = sc.nextInt();

        System.out.println("Enter an index no:");
        int index = sc.nextInt();

        System.out.println("Enter an amount in taka:");
        double amt = sc.nextDouble();

        try {
            System.out.println("Result: " + (x / y));
            System.out.println("THE VALUE IS : " + arr[index]);
            System.out.println("After the sensitive code");

            withdraw(amt); // Now it's static and works fine

            try {
                System.out.println(s.charAt(0));
            } catch (NullPointerException e) {
                System.out.println("Found Exception inside nested try catch.");
                System.out.println(e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Enter another value of Y which is not zero.");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter valid index number.");
        } catch (NotEnoughMoney e) {
            System.out.println("I am inside the process");
            System.out.println(e);
        }

        System.out.println("PROGRAMME ENDS HERE.");
    }

    // Withdraw method is static now
    public static void withdraw(double tk) throws NotEnoughMoney {
        if (tk <= 0) {
            throw new NotEnoughMoney();
        } else {
            System.out.println("Withdraw confirmed.");
        }
    }
}
