package visitor;

public class Monkey implements Animal{
    public void shout() {
        System.out.println("У-у. А-а.");
    }
    @Override
    public void accept(AnimalOperation operation) {
        operation.visitMonkey(this);
    }
}
