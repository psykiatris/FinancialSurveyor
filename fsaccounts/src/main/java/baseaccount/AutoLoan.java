package baseaccount;

public class AutoLoan {
    public static Account account;
    private static final int maxTerm = 120;    // Maximum of 10 years for auto loans

    public AutoLoan(double prin, double rate) {

        account = new Account("Auto Loan", prin, rate, maxTerm);
    }



}
