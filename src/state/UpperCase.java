package state;

public class UpperCase implements WritingState {
    @Override
    public void write(String text) {
        System.out.println(text.toUpperCase());
    }
}
