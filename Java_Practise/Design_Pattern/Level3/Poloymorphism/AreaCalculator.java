package Level3.Overloading_Overriding;

public class AreaCalculator {
    
    public double Area(double length,double width){
        double rect=length*width;
        return rect;
    }

    public double Area(double side){
        double sqr=side*side;
        return sqr;
    }

    public double Area(int radius){
        double circle=3.1416*radius*radius;
        return circle;
    }

    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();
        System.out.println("Area of the Rectangle is : "+a.Area(15, 12));
        System.out.println("Area of the Square is : "+a.Area(10.55));
        System.out.println("Area of the Circle is : "+a.Area(5));
    }


}
