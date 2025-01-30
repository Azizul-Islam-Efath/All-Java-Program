package Projects;

import java.util.Scanner;

public class Temperature {
public static void main(String[]args){
Scanner temp=new Scanner(System.in);

float c,fahrenh;
    System.out.println("ENTER THE TEMPERATURE OF CELSIUS: ");
c=temp.nextFloat();
fahrenh=(9/5*c)+32;

    System.out.println("THE TEMPARETURE AT FAHRENHITE LEVEL IS : "+fahrenh+"DEGREE");



}
}
