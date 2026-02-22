package OOP.Quiz_1;

public class Person {

    protected String nid;
    public Person(String nid){
        this.nid=nid;
    }
}

class Employee extends Person{
    public Employee(String nid){
        super(nid);
    }

    void display(){
        System.out.println("The NID card no is : "+nid);
    }

    public static void main(String[] args) {
        Employee E1=new Employee("273929292");
        E1.display();
    }
}
