package session11.a_slides_strategy_pattern;

public class Demo {

    public static void main(String[] args) {
        InterestStrategy interestStrategy = new CheckingAccountInterest();

        BankAccount bankAccount = new BankAccount(100, interestStrategy);

        System.out.println("Total Balance: "+bankAccount.getBalance());

        bankAccount.accrueInterest();

        System.out.println("Total Balance: "+bankAccount.getBalance());
    }
}
