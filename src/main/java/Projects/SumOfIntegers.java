package Projects;
import java.util.Scanner;
public class SumOfIntegers {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int num,sum=0,reminder;
        System.out.println("ENTER AN INTEGER: ");
    num=input.nextInt();
    int temp=num;
    
    while(temp!=0){
    reminder=temp%10;
    sum=sum+reminder;
    temp=temp/10;
    }
        System.out.println("SUM OF THE INTEGERS ARE: "+sum);
    
    }
}
