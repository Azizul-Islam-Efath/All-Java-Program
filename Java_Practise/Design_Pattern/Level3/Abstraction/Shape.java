package Level3.Abstraction;

public abstract class Shape {
  public abstract void info();
}

class Rectangle extends Shape{
    public void info(){
        System.out.println("This is a Rectangle Shape.");
    }
}

class Circle extends Shape{    
    public void info(){
        System.out.println("This a Circle Shape");
    }


    public static void main(String[] args) {
        Shape R = new Rectangle();
        R.info();
        
        Shape C = new Circle();
        C.info();
        }
}

