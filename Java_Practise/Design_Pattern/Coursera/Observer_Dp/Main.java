public class Main {
    public static void main(String[] args) {

        // Create MovieTopic instance
        MovieTopic movieTopic = new MovieTopic();

        // Create subscribers
        MovieSubscriber sub1 = new MovieSubscriber("Alice");
        MovieSubscriber sub2 = new MovieSubscriber("Bob");

        // Add subscribers
        movieTopic.addSubscriber(sub1);
        movieTopic.addSubscriber(sub2);

        // Publish movies
        movieTopic.publishMovie("Avengers: Secret Wars");
        movieTopic.publishMovie("The Batman 2");
    }
}
