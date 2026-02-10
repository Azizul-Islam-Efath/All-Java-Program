package Level2.Encapsulation;

import java.util.Scanner;


public class Grade {
    private double mark1;
    private double mark2;
    private double mark3;

    public void InputMarks(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mark for subject 1 :\n");
        mark1=input.nextDouble();
        System.out.println("Enter Mark for subject 2 :\n");
        mark2=input.nextDouble();
        System.out.println("Enter Mark for subject 3 :\n");
        mark3=input.nextDouble();

        input.close();
    }
    public double Calculate(){
        double avg=(mark1+mark2+mark3)/3;
        return avg;
    }

    public void GradeAssign(){
        double avg=Calculate();
        if (avg >= 80)
            System.out.println("Grade : A+");
        else if (avg >= 70)
            System.out.println("Grade : B+");
        else if (avg >= 60)
            System.out.println("Grade : C+");
        else if (avg >= 50)
            System.out.println("Grade : D+");
        else
            System.out.println("Grade : F+..YEAAAA You have Got the highest rank..!!!");
    }
    public static void main(String[] args) {
        Grade s = new Grade();
        s.InputMarks();
        System.out.println("Your Average Marks Is : "+s.Calculate());
        s.GradeAssign();
    }
    
}
