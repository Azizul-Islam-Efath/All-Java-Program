package Projects;

public class Eligiblity extends CV {
    

    public Eligiblity(String name, String location, String requirements, double salary, String postName, 
                      String applicantName, int age, String qualification, String maritalStatus, 
                      String nationality, String phoneNumber, String lang) {
        super(name, location, requirements, salary, postName, applicantName, age, qualification, maritalStatus, nationality, phoneNumber, lang);
    }


    public void isEligible() {
        System.out.println("\n\n------------------ELIGIBILITY CHECK-----------------------\n");
        if (requirements.equals(lang)) {
            System.out.println("THIS PERSON IS ELIGIBLE FOR THE POST");
        } else {
            System.out.println("SORRY!! YOU ARE NOT ELIGIBLE");
        }
    }
}
