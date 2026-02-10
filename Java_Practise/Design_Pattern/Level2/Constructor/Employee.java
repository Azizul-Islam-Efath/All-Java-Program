package Level2.Constructor;

public class Employee {
    public String name;
    public String id;
    public float salary;

    public Employee(String name,String id,float salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void display(){
        System.out.println("\nEmployee Info:\n");
        System.out.println("Employee name is :"+name+"\nEmployee ID :"+id+"\nSalary :"+salary+"TK");
    }
    void display(String name,String id,double salary){
        System.out.println("\nEmployee Info:\n");
        System.out.println("Employee name is :"+name+"\nEmployee ID :"+id+"\nSalary :"+salary+"TK");
    }

    public static void main(String[] args) {
        Employee E1 = new Employee("Azizul Islam","241-35-364",10000);
        E1.display();
        E1.display("Sadia Jaman Mishka","242-34-399",100000);
    }
}
