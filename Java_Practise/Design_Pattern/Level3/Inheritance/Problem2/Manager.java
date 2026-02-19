package Level3.Inheritance.Problem2;


class Employee extends Person{
    void display2(){
    System.out.println("I am an Employee");
}
}



class Person {
    
    void display1(){
    System.out.println("I am a person");
    }
}




public class Manager extends Employee {
    void display(){
        System.out.println("I am the manager.");
    }
    
    
    public static void main(String[] args) {
        Manager m=new Manager();
        m.display1();
        m.display2();
        m.display();
    }
}
