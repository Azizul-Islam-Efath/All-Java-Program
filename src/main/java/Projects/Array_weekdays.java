package Projects;
import java.util.Scanner;
public class Array_weekdays {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[] day={"Monday","Tuesday","Wednesday","Thursday","Friday","SATURDAY","SUNDAY"};
        int i,num;
        System.out.println("ENTER THE NUMBER: ");
        num=input.nextInt();
        for(i=0;i<=7;i++){
        if(num==i+1){
            System.out.println("ITS "+day[i]);
        }
    
    
    
    }
        
        
        
        
        
        
        
    }
}
