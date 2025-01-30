package Projects;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int i,first=0,sec=1,n,count;
    System.out.println("ENTER THE RENGE:");
    n=input.nextInt();
   
        System.out.print(first+" "+sec+" ");
    for(i=3;i<=n;i++){
    count=first+sec;
    first=sec;
    sec=count;
        System.out.print(count+" ");         
   }
    
  
    
    
    
    }
}
