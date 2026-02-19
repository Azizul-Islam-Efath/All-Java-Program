package Level3.Inheritance.Problem3;

public class Shape {
    public void display(){
        System.out.println("This is a Shape.");
    }    
}

class Circle extends Shape{
    public void display1(){
        System.out.println("Making Circle Through Shapes.");
    }
}
class Triangle extends Shape{
    public void display2(){
        System.out.println("Making Triangle Through Shapes.");
    }

    public static void main(String[] args) {
        Triangle s = new Triangle();
        s.display();
        s.display2();

        Circle c = new Circle();
        c.display();
        c.display1();
    }
}
