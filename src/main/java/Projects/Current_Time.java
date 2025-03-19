package Projects;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Current_Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        
      String ft =  time.format(formatter);
        
        
        System.out.println("THE TIME IS NOW "+ft);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
