package Level4.Composition;

public class Dept {
    String name;
    Dept(String name){
        this.name=name;
    }

    void display(){
        System.out.println("This is "+name+"Department");
    }
}
class Professor{
    void info(String name,String Subject){
        System.out.println("\nProfessors Name is : "+name);
        System.out.println("Professors Subject is : "+Subject);
    }

    public static void main(String[] args) {
        Dept d = new Dept("Software Engineering");
        d.display();

        Professor p = new Professor();
        p.info("Azizul Islam", "Intro to Software");
        p.info("Sadia Jaman Mishka", "Neutrition and Food Engineering");
    }
}
