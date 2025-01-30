package Projects;
import java.util.Scanner;
public class Conditionaldemo {
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int a,b,large;
    System.out.println("ENTER TWO NUMBER: ");
a=input.nextInt();
b=input.nextInt();
large=(a>b) ? a : b ;
    System.out.println("THE LARGEST NUMBER IS: "+large);



}
}
