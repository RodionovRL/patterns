package chainOfResponsibility;

public abstract class Account implements Payment {
    private Payment successor;
    int balance;

    @Override
    public void setNext(Payment account) {
        this.successor = account;
    }

    @Override
    public void pay(int amountToPay) {
        if (this.canPay(amountToPay)) {
            System.out.printf("Оплата %d, используя %s\n", amountToPay, this.getClass().getName());
        } else if (this.successor != null) {
            System.out.printf("Нельзя заплатить, используя %s. Обработка ..\n", this.getClass().getName());
            this.successor.pay(amountToPay);
        } else {
            throw new RuntimeException("На счетах не хватает средств\n");
        }
    }

    private boolean canPay(int amount) {
        return this.balance >= amount;
    }
}
