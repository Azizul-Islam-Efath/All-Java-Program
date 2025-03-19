package Projects;

public class Main {
    public static void main(String[] args) {
 
        Company company = new Company("STARTECH IT COMPANY", "Dhaka", "LANGUAGE: Java , C++ , Python", 60000, "Software Developer");
        company.displayDetails();

 
        CV cv = new CV("STARTECH IT COMPANY", "Dhaka", "LANGUAGE: Java , C++ , Python", 60000, "Software Developer",
                       "AZIZUL ISLAM", 23 , "B.Sc Engineer in Software Engineering", "Single", "BANGLADESHI", "0175568545", "LANGUAGE: Java , C++ , Python");
        cv.displayDetails();

 
        Eligiblity eg = new Eligiblity("STARTECH IT COMPANY", "Dhaka", "LANGUAGE: Java , C++ , Python", 60000, "Software Developer",
                                       "AZIZUL ISLAM", 23 , "B.Sc Engineer in Software Engineering", "Single", "BANGLADESHI", "0175568545", "LANGUAGE: Java , C++ , Python");
        eg.isEligible();
    }
}
