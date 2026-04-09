public class PausedState implements State {

    @Override
    public void play(TVContext context) {
        System.out.println("Resuming TV.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(TVContext context) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(TVContext context) {
        System.out.println("Stopping TV.");
        context.setState(new StoppedState());
    }

    @Override
    public String getName() {
        return "Paused State";
    }
}
