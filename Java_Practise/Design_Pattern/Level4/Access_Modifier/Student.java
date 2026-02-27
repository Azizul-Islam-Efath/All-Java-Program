package Level4.Access_Modifier;

public class Student {
    private String name;
    private String id;
    private double cgpa;

    void setName(String name){
        this.name=name;
    }

    void setId(String id){
        this.id=id;
    }

    void setCgpa(double cgpa){
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


class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Azizul Islam");
        s1.setId("241-35-364");
        s1.setCgpa(3.98);

        System.out.println("\nStudent name is "+s1.getName());
        System.out.println("Student Id is "+s1.getId());
        System.out.println("Student CGPA is "+s1.getcgpa());

    }
}