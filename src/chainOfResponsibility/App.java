package chainOfResponsibility;

public class App {
    public static void main(String[] args) {
        Payment alfa = new Alfa (100);
        Payment sber = new Sber (200);
        Payment tink = new Tink (300);

        Chain chain = new Chain();
        chain.setChain(alfa, sber, tink);

        alfa.pay(250);
    }
}
