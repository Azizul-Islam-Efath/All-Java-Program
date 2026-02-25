package Level4.Access_Modifier.acc;

import Level4.Access_Modifier.Person;

public class Employeee extends Person{
    
    Employeee(String NID){
        super(NID);
    }

    void display(){
        System.out.println("The NID no of the person is : "+NID);
    }

    public static void main(String[] args) {
        Employeee e1 = new Employeee("1237-4897-4479");
        
        e1.display();
    
    }
}
