package Spring_25;

public class ExaminationController {

    private static ExaminationController instance;
    private boolean isSubmitted = false;   // to check submission

    // Private constructor
    private ExaminationController() {
        System.out.println("Controller Connected");
    }

    // Only one object allowed
    public static ExaminationController getInstance() {
        if (instance == null) {
            instance = new ExaminationController();
        }
        return instance;
    }

    public void submit(String dept) {

        if (isSubmitted) {
            System.out.println("❌ Submission already done. Cannot submit again.");
        } else {
            isSubmitted = true;
            System.out.println("✅ " + dept + " submitted successfully.");
        }
    }
}

class Faculty {
    public static void main(String[] args) {

        ExaminationController controller = ExaminationController.getInstance();

        controller.submit("CSE");
      
        ExaminationController Controller1 = ExaminationController.getInstance();

        Controller1.submit("EEE");

        System.out.println(controller==Controller1);
    }
}