package Level1;

public class Areaa_Calculator {
    public float lenght,width;

    void Calculate(float lenght,float width){
        float Area=lenght*width;
        System.out.println("The are of the Rectangle is: "+Area);
    }
    public static void main(String[] args) {
        Areaa_Calculator A = new Areaa_Calculator();
        A.Calculate(3,2);
        A.Calculate(2,4);
        A.Calculate(6,8);
        A.Calculate(5,2);
        A.Calculate(1,2);
        A.Calculate(3,9);
    }

    
}
