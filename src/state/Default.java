package state;

public class Default implements WritingState {
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
