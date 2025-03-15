package src;
import baseaccount.*;


public class RunRun {
    public static void main(String[] args) {

        // Creating type passing info to record (immutalbe)
        new CreditCard(1000, 24.49);
        // Qualify with reference to class.
        System.out.println("Name: " + CreditCard.account.name());
        System.out.println("Principal: " + CreditCard.account.prin());
        System.out.println("Rate: " + CreditCard.account.rate() + "%");
        System.out.println("Term: " + CreditCard.account.term() + " months");

        // Now autro loan
        System.out.println();
        new AutoLoan(7000, 6.39);
        System.out.println("Name: " + AutoLoan.account.name());
        System.out.println("Principal: " + AutoLoan.account.prin());
        System.out.println("Rate: " + AutoLoan.account.rate() + "%");
        System.out.println("Term: " + AutoLoan.account.term() + " months");







    }
}
