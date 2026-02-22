package OOP.Quiz_1_2;

public class Student {

    private String name,id;
    private double cgpa;
    
    Student(String name,String id,double cgpa){
    this.name=name;
    this.id=id;
    this.cgpa=cgpa;        
    }

    String getName(){
        return name;
    }
    String getId(){
        return id;
    }
    double getcgpa(){
        return cgpa;
    }
    
}

class StudentInfo {
    public static void main(String[] args) {
        Student s1=new Student("Azizul Islam", "241-35-364", 3.66);
        System.out.println("Name: "+s1.getName()+"\nID: "+s1.getId()+"\nCGPA: "+s1.getcgpa());
    }
    
}