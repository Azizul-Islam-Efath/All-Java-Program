package Projects;

import java.util.Random;

public class Random_Demo {
    public static void main(String[]args) {
        Random rand = new Random();
        
        
        int random = rand.nextInt(6) + 5 ;
        System.out.println(random);
        
    }
        
}
