package visitor;

public class Dolphin implements Animal {
    public void speak() {
        System.out.println("Здесь что-то на дельфиньем");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitDolphin(this);
    }
}
