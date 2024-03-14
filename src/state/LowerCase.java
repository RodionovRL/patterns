package state;

public class LowerCase implements WritingState {
    @Override
    public void write(String text) {
        System.out.println(text.toLowerCase());
    }
}
