package chainOfResponsibility;

public interface Payment {
    void pay(int amountToPay);
    void setNext(Payment nextAcc);
}
