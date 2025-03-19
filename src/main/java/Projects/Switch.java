package Projects;
import java.util.Scanner;
public class Switch {
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int opt;
    System.out.print("SELECT AN OPTION : ");
    opt=input.nextInt();
    
    switch(opt){
        case 1:
            System.out.println("SET LANGUAGE TO BENGALI");
            break;
        case 2:
            System.out.println("SET LANGUAGE TO HINDI");
            break;
        
        case 3:
            System.out.println("SET LANGUAGE TO URDU");
            break;
           
        default:
            System.out.println("SET LANGUAGE TO ENGLISH");
       
    
    
    
    
    
    }






}    
}
