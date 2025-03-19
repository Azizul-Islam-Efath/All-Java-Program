package Projects;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[]args){
Scanner input=new Scanner(System.in);

int NUMBER;
        System.out.print("ENTER AN INTEGER: ");
NUMBER=input.nextInt();

if(NUMBER%2==0){
    System.out.println("ITS A EVEN NUMBER");
}
else{
    System.out.println("ITS AN ODD NUMBER");
}

    
}
}