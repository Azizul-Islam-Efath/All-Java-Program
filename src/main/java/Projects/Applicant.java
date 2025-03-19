package Projects;

class Applicant extends Company {
    private String cv;

    // Constructor
    public Applicant(String name, String location, String requirements, int salary, String postName, String cv) {
        super(name, location, requirements, salary, postName);
        this.cv = cv;
    }

    // Getters and Setters
    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    // Overridden method to display applicant details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("CV: "+cv);
}
}