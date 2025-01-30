package Projects;
import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int n,m,result=0;
        System.out.print("ENTER THE STARTING NUMBER : ");
    n=input.nextInt();
        System.out.print("ENTER THE LAST NUMBER : ");
    m=input.nextInt();
    
    for(int i=n;i<=m;i++){
        System.out.println("MULTIPLICATION TABLE OF :"+i+"   |-------------|");
        for(int j=1;j<=10;j++){
        System.out.println("                              "+i+" x "+j+"    = "+i*j);
    }
 
    }
    }
}
