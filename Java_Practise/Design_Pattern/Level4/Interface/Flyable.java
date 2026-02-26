package Level4.Interface;

interface Flyable {
   void fly();    
}

interface Swimable {
   void Swim();    
}

class Duck implements Flyable,Swimable{
    public void fly(){
        System.out.println("Duck can Fly.");
    }
    public void Swim(){
        System.out.println("Duck can Swim.");
    }

    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.Swim();
    }
}