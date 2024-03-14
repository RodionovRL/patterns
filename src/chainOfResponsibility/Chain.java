package chainOfResponsibility;

public class Chain {
    public void setChain(Payment... accounts) {
        for (int i = 0; i < accounts.length - 1; i++) {
            accounts[i].setNext(accounts[i + 1]);
        }
    }

}

