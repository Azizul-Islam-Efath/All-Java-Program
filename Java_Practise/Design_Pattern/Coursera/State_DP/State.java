public interface State {
    void play(TVContext context);
    void pause(TVContext context);
    void stop(TVContext context);
    String getName();
}
