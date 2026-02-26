package Level4.Composition;

public class Library {
    String Section;
    String name;
    Library(String Section,String name){
        this.Section=Section;
        this.name=name;
    }

    void display(){
        System.out.println("This is "+Section+"Section");
        System.out.println("Books available here are: "+name);
    }

    void display(String Section,String name){
        System.out.println("This is "+Section+"Section");
        System.out.println("Books available here are: "+name);
    }

    public static void main(String[] args) {
        Library B = new Library("Engineering", "Theory of Computing");
        B.display();
        B.display("Nutrition", "Intro to Psychology");
    }
}
