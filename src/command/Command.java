package command;


public interface Command {
    void execute();
    void unExecute();
    default boolean isReversible() {
        return true;
    }
}
