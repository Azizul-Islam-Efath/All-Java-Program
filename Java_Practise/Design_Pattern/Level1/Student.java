
package Level1;


public class Student {
  public String name;
  public String id;
  public double cgpa;
  
  public void display(){
       System.out.println("My name is: "+name);
       System.out.println("My ID: "+id);
       System.out.println("My CGPA: "+cgpa);
  }
    public static void main(String[] args) {
        Student s = new Student();
        s.name="Azizul Islam";
        s.id="241-35-364";
        s.cgpa=3.98;
        s.display();
    }
    
    
}
