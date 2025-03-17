package baseaccount;

public class SavingsAccount {
    public static Account account;
    private static final int maxTerm = 60;  // CDs are from 1 - 60 months

    public SavingsAccount(double prin, double rate) {
        account = new Account("Savings Account", prin, rate, maxTerm);
    }
}
