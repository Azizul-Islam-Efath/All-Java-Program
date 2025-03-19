package Projects;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in); 
    int i,m,n,count=0,sum=0,temp,r;
        System.out.print("ENTER INITIAL NUMBER: ");
    m=input.nextInt();

        System.out.print("ENTER ENDING NUMBER: ");
    n=input.nextInt();

        System.out.println("THE ARMSTRONG NUMBER FROM "+m+" TO "+n+" IS :");
    for(i=m;i<=n;i++){
        temp=i;

        
        while(temp!=0){
    r=temp%10;
    sum=sum+r*r*r;
    temp=temp/10;
                      }
    
        if(sum==i){
        System.out.println(" "+i);
         count++;
                  }
    sum=0;
                    }
        System.out.println("TOTAL ARMSTRONG NUMBER IS: "+count);
    }
}
