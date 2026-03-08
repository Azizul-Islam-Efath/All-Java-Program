package Prototype;


interface UniManagement{
    UniManagement clone();
}

public class Student implements UniManagement {
    private String StudentId,Dept,Name;
    public Student(String Dept,String StudentId,String Name){
        this.Dept=Dept;
        this.StudentId=StudentId;
        this.Name=Name;
    }

    public UniManagement clone(){
        return new Student(Dept, StudentId, Name);
    }
    
    public void setName(String Name){
        this.Name=Name;
    }
    public void setStudentId(String StudentId){
        this.StudentId=StudentId;
    }

    public void display(){
        System.out.println("\nStudent Info: ");
        System.out.println("Student Name: "+Name);
        System.out.println("Student ID: "+StudentId);
        System.out.println("Student Dept: "+Dept);
        
    }
}

class StudentObjects{
    public static void main(String[] args) {
        UniManagement St=new Student("SWE", "241-35-364", "Azizul Islam");

        Student S1 =(Student)St.clone();
        S1.setName("Sadia Jaman");
        S1.setStudentId("242-34-444");

        Student S2 =(Student)St.clone();
        S2.setName("Efath");
        S2.setStudentId("243-33-402");

        System.out.println("Base Student Object: ");
        ((Student)St).display();

        System.out.println("\nCloned Student Objects:\n");
        S1.display();
        S2.display();

    }
}
