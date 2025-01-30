package Projects;
import java.util.Scanner;
public class VowelCons {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    char Ch;
        System.out.println("ENTER A CHARACTER: ");
  Ch=input.next().charAt(0);
    if(Ch=='A' || Ch=='E' || Ch=='I' || Ch=='O' || Ch=='U' || Ch=='a' || Ch=='e' || Ch=='i' || Ch=='o' || Ch=='u'){
        System.out.println("ITS A VOWEL");
    }
    else{
        System.out.println("ITS A CONSONANT");
    }
    
    
        
        
        
        
    }
    
}
