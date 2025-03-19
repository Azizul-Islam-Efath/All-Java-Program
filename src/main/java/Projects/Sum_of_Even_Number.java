package Projects;
import java.util.Scanner;
public class Sum_of_Even_Number {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int a,b,i,result=0;
    System.out.println("ENTER TWO NUMBER :-  ");
    a=input.nextInt();
    b=input.nextInt();
    
        System.out.println("THE EVEN NUMBERS ARE: ");
    for(i=a;i<=b;i++){
    if(i%2==0){
        System.out.println(" "+i);
    result+=i;
    }
    }
    
        System.out.println("SUM OF THE EVEN NUMBERS ARE : "+result);
    
    
        System.out.println("THE ODD NUMBERS ARE: ");
    for(i=a;i<=b;i++){
    if(i%2!=0){
        System.out.println(" "+i);
    result+=i;
    }
    }
    
        System.out.println("SUM OF ODD THE NUMBERS ARE : "+result);
    
    
    
    }
}
