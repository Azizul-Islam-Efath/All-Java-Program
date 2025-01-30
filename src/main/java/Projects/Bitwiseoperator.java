package Projects;
import java.util.Scanner;
public class Bitwiseoperator {
public static void main(String[]args){
 Scanner input=new Scanner(System.in);
 int a,b,c;
    System.out.println("ENTER THE VALUE OF A AND B: ");
 a=input.nextInt();
 b=input.nextInt();
 
    c=a&b;
    System.out.println("A&B = "+c);
    
    c=a|b;
    System.out.println("A|B = "+c);
    
    c=a^b;
    System.out.println("A^B = "+c);
    
    c=a>>3;
    System.out.println("a>>3 = "+c);
    
    c=a<<3;
    System.out.println("a<<3 = "+c);
    
    
    
    
}    
}
