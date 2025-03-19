package Projects;

class CV extends Company {
    public String applicantName;
    public int age;
    public String qualification;
    public String maritalStatus;
    public String nationality;
    public String phoneNumber;
    public String lang; 

    
    public CV(String name, String location, String requirements, double salary, String postName, 
              String applicantName, int age, String qualification, String maritalStatus, 
              String nationality, String phoneNumber, String lang) {
        super(name, location, requirements, salary, postName);
        this.applicantName = applicantName;
        this.age = age;
        this.qualification = qualification;
        this.maritalStatus = maritalStatus;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.lang = lang;
    }

    
    @Override
    public void displayDetails() {
        System.out.println("\n\n------------------APPLICANT INFORMATION-----------------------\n");
        System.out.println("                     Applicant Name   : " + applicantName);
        System.out.println("                     Age              : " + age);
        System.out.println("                     Qualification    : " + qualification);
        System.out.println("                     Marital Status   : " + maritalStatus);
        System.out.println("                     Nationality      : " + nationality);
        System.out.println("                     Phone Number     : " + phoneNumber);
        System.out.println("                     Known Languages  : " + lang);
    }
}
