package Projects;
import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 int i,j,a,b,count=0;
        System.out.print("ENTER THE STARTING NUMBER: ");
 
 a=input.nextInt();
        System.out.print("ENTER THE ENDING NUMBER: ");

 b=input.nextInt();
 
        System.out.println("THE PRIME NUMBERS ARE: ");
 
 for(i=a ; i<=b ; i++)
 {
     for(j=2 ; j<=i-1 ; j++){
 
         if(i%j==0)
        {
         count++;
         break;
        }
     }
        if(count==0)
         
            System.out.println(i);
            count=0;
        
        
 }
    
    }
}
