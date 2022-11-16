package session9.b_customexceptions;

public class WarningLargeDeposit extends RuntimeException{

    int amount;

    public WarningLargeDeposit(int amount) {
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public int getDepositLimit() {
        return 100_000;
    }
}
