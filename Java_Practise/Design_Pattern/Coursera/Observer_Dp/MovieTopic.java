import java.util.ArrayList;
import java.util.List;

public class MovieTopic implements MoviePublisher {

    // List of subscribers
    private List<Subscriber> subscribers = new ArrayList<>();

    // Add subscriber
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Remove subscriber
    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Notify all subscribers
    @Override
    public void notifySubscribers(String movie) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(movie);
        }
    }

    // Publish a new movie
    public void publishMovie(String movie) {
        System.out.println("New movie released: " + movie);
        notifySubscribers(movie);
    }
}
