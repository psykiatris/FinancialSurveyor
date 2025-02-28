package src;
import baseaccount.CreditCard;


public class RunRun {
    public static void main(String[] args) {

        CreditCard cc = new CreditCard(1000, 24.49);
        System.out.println(cc.name);
        System.out.println("Term: " + cc.maxTerm + " months.");


    }
}
