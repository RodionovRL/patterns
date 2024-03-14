package visitor;

public class App {
    public static void main(String[] args) {
        Animal monkey = new Monkey();
        Animal lion = new Lion();
        Animal dolphin = new Dolphin();

        AnimalOperation speak = new Speak();

        monkey.accept(speak);
        lion.accept(speak);
        dolphin.accept(speak);
    }
}
