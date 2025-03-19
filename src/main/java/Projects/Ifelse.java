package Projects;
import java.util.Scanner;
public class Ifelse {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);    
    
    int age;
        System.out.println("ENTER THE AGE OF THE VOTER:  ");
    
    age=input.nextInt();
     
    if(age==18&&age>18){
         System.out.println("THIS IS PERSON IS A VALID VOTER ");
     }
     else{
         System.out.println("THIS PERSON IS NOT VALID FOR VOTING");
     }
    
    }
}
