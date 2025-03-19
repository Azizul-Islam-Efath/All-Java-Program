package Projects;

class Company {
    public String name;
    public String location;
    public String requirements;
    private double salary;
    public String postName;

   
    public Company(String name, String location, String requirements, double salary, String postName) {
        this.name = name;
        this.location = location;
        this.requirements = requirements;
        this.salary = salary;
        this.postName = postName;
    }

    
    public double getSalary() {
        return salary;
    }

   
    public void displayDetails() {
        System.out.println("---------------------COMPANY'S INFORMATION------------------------\n");
        System.out.println("                     Company Name  : " + name);
        System.out.println("                     Location      : " + location);
        System.out.println("                     Post Name     : " + postName);
        System.out.println("                     Requirements  : " + requirements);
        System.out.println("                     Salary        : " + salary);
    }
}
