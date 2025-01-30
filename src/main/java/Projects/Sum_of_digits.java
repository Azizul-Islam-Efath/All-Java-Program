package Projects;
import java.util.Scanner;
public class Sum_of_digits {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int a,b,i,result=0;
    System.out.println("ENTER TWO NUMBER :-  ");
    a=input.nextInt();
    b=input.nextInt();
    
    for(i=a;i<=b;i++){
    result+=i;
    }
    
        System.out.println("SUM OF THE NUMBER IS : "+result);
    
    
    
    
    
    }
}
