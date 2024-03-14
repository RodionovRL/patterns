package visitor;

public class Lion implements Animal {
    public void roar() {
        System.out.println("Р-р-р-р-р");
    }
    @Override
    public void accept(AnimalOperation operation) {
        operation.visitLion(this);
    }
}
