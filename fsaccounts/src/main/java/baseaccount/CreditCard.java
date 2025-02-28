package baseaccount;

public class CreditCard extends AccountInfo {
    public final int maxTerm = 24;   // range from 0-24 months


    public CreditCard(double p, double r){

        super(p, r);
        this.name = "Credit Card";


    }
}
