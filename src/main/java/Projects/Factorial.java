package Projects;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int a,i,result=1;
    System.out.println("ENTER THE NUMBER :-  ");
    a=input.nextInt();
    
    for(i=a;i>=1;i--){
    result*=i;
    }
    
        System.out.println("FACTORIAL IS : "+result);
    
    
    
    
    
    }
}
