package Projects;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
 Scanner input=new Scanner(System.in);
 int m,n,i,count=0,temp,reminder,rev=0;
 System.out.print("ENTER INITIAL VALUE: ");
    m=input.nextInt();
 System.out.print("ENTER ENDING VALUE: ");   
    n=input.nextInt();
    
        System.out.println("THE PALINDROME FROM "+m+" TO "+n+"IS: ");
      for ( i = m; i <= n; i++) {
    
            temp= i;
            while(temp!=0){
            reminder=temp%10;
             rev=rev*10+ reminder;
             temp=temp/10;
           }
           if(rev==i){
               System.out.print(" "+i);               
               count++;
           }
         
           rev=0;
        }
        System.out.println(" "+rev);
        System.out.println("TOTAL PALINDROME NUMBER IS : "+count);
    
    
    }
}