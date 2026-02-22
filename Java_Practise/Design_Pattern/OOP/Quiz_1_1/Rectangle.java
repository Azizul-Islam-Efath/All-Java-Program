package OOP.Quiz_1_1;

public class Rectangle {
    double length,width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    double Calculate(){
        double area=length*width;
        return area;
    }


    public static void main(String[] args) {
        Rectangle r=new Rectangle(12,11);
        System.out.println("The are of the Rectangle is: "+r.Calculate());
    }
    
}
