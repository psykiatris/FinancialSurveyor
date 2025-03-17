package baseaccount;

public class MortgageLoan {
    public static Account account;
    private static final int maxTerm = 360;   // 360 = 30 years

    public MortgageLoan(double prin, double rate) {
        account = new Account("Mortgage Loan", prin, rate, maxTerm);
    }

    // Methods to follow
}
