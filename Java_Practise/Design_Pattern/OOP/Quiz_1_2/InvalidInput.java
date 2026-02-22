package OOP.Quiz_1_2;

import java.util.*;

public class InvalidInput {

    // Method to add two integers
    public int calculate(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InvalidInput obj = new InvalidInput();

        try {
            System.out.print("Enter first integer: ");
            int num1 = sc.nextInt();  // If input is not an integer, it will throw InputMismatchException

            System.out.print("Enter second integer: ");
            int num2 = sc.nextInt();   // If input is not an integer, it will throw InputMismatchException

            System.out.println("Sum: " + obj.calculate(num1, num2));

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}