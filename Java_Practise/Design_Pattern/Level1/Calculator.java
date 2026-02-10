package Level1;

public class Calculator {
    void add(int a,int b){
        System.out.println("The Sum is = "+(a+b));
    }
    void sub(int a,int b){
        System.out.println("The Sub is = "+(a-b));
    }
    void multi(int a,int b){
        System.out.println("The multiplication is = "+(a*b));
    }
    void div(int a,int b){
        double divi=(a/b);
        System.out.println("The division is = "+divi);
    }
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        c.add(34, 43);
        c.sub(34, 43);
        c.multi(34,43);
        c.div(34, 4);
    }
}
