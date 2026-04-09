public class Main {
    public static void main(String[] args) {

        TVContext tv = new TVContext();

        // Initial state
        System.out.println("Initial state: " + tv.getCurrentState().getName());

        // Start playing
        tv.play();

        // Invalid: play again
        tv.play();

        // Pause
        tv.pause();

        // Invalid: pause again
        tv.pause();

        // Resume
        tv.play();

        // Stop
        tv.stop();

        // Invalid: stop again
        tv.stop();

        // Invalid: pause when stopped
        tv.pause();

        // Start again
        tv.play();
    }
}
