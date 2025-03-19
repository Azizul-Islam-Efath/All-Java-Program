package Projects;
import java.util.Arrays;
import java.util.Scanner;
public class Array_ascending_descending {
    public static void main(String[]args){
    
        Scanner input= new Scanner(System.in);
        int[] Array={-10,-5,4,10,100};
    
    Arrays.sort(Array);
        System.out.print("ASCENDING FORM: ");
    for(int i=0;i<5;i++){
        System.out.print(" "+Array[i]);   
    }
        System.out.println(" ");
        System.out.print("DESCENDING FORM: ");
    for(int i=4;i>=0;i--){
        System.out.print(" "+Array[i]);
    }
    
    }
}
