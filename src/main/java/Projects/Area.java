package Projects;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner side = new Scanner(System.in);

        //FOR TRIANGLE
        Double Land, Height, Area;
        System.out.println("ENTER THE LAND AND HEIGHT OF THE TRIANGLE: ");
        Land = side.nextDouble();
        Height = side.nextDouble();
        Area = .5 * Land * Height;

        System.out.println("ARE OF THE TRIANGLE IS : " + Area);

        //FOR TRIANGLE
        Double parameter,WIDTH;
        System.out.println("ENTER THE WIDTH OF THE TRIANGLE: ");
        WIDTH = side.nextDouble();
        parameter = Land+Height+WIDTH;

        System.out.println("PARAMETER OF THE TRIANGLE IS : " + parameter);
        
        
        //FOR Circle
        Double areaofcircle,r,pie=3.1416;
        System.out.println("ENTER THE RADIUS OF THE CIRCLE: ");
        r = side.nextDouble();
        areaofcircle = pie*r*r;

        System.out.println("ARE OF THE TRIANGLE IS : " + areaofcircle);

        //FOR TRIANGLE
        Double parameterofcircle;
        parameterofcircle=2*pie*r;

        System.out.println("PARAMETER OF THE circle IS : " + parameterofcircle);
        
        
        
        

    }
}
