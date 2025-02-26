package baseaccount;

/*
This will store the basic account in needed for all
account types:
    Credit Cards
    Auto laons
    Mortgages
    Personal loan/line of credit
    etc.
User info would be: name, principal, interest rate
 */

public abstract class AccountInfo {
    public String name;
    public double principal;
    public double interestRate;

    AccountInfo(double principal, double interestRate){
        this.name = "Base Account";
        this.principal = principal;
        this.interestRate = interestRate;
    }
}
