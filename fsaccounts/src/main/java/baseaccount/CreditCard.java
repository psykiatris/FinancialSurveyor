package baseaccount;


public class CreditCard {
    public final int maxTerm = 24;   // range from 0-24 months
    public static Account account;

    public CreditCard(double prin, double rate) {

        account = new Account("Credit Card", prin, rate, maxTerm);
        //System.out.println("Name: " + account.name());

    }


}
