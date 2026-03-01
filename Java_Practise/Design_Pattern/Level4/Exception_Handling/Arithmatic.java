package Level4.Exception_handling;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two value: ");
        int a =input.nextInt();
        int b=input.nextInt();
        input.close();

        try{
            int result = a/b;
            System.out.println("Result : "+result);
        }catch (ArithmeticException e){
            System.out.println("Error : Any number cannot be devided by ZERO!");            
        }
        System.out.println("Program Run Continuously.");
    }
}
