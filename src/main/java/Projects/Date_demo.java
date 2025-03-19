package Projects;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_demo {
    public static void main(String[] args) {
        
        Date date = new Date();
        System.out.println("DATE : "+date);
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        
       String CD= dateFormat.format(date);
        System.out.println("CURRENT DATE : "+CD);
    
    
    }
    
}
