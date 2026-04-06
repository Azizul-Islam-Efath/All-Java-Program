public class MovieSubscriber implements Subscriber {
    
    // Private attribute
    private String name;

    // Constructor
    public MovieSubscriber(String name) {
        this.name = name;
    }

    // Update method
    @Override
    public void update(String movie) {
        System.out.println(name + " received notification: New movie released - " + movie);
    }
}
