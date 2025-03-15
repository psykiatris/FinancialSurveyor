package baseaccount;

/*
This CreditCard class takes input and passes to
a record class (Account) with static info. Creates am
immutable object (record) with info to process payment
or savings results.
 */


public class CreditCard {
    public static Account account;
    private static final int maxTerm = 24;

    public CreditCard(double prin, double rate) {

        // range from 0-24 months
        account = new Account("Credit Card", prin, rate, maxTerm);


    }


}
