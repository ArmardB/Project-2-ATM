package bellamy.armard.Project2ATM;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class Transaction {

    public enum TransType {DEPOSIT, WITHDRAWAL, TRANFER}
    private double amount;
    private int customerID;
    private int fromAccountNumber;
    private int toAccountNumber;

    public Transaction(TransType type, int customerID, int fromAccountNumber, double amount){

    }

    public Transaction(int customerID, int fromAccountNumber, int toAccountNumber, double amount){

    }

    public int getFromAccountNumber(){
        return 1;
    }

    public int getToAccountNumber(){
        return 1;
    }

    public double getAmount(){
        return 1.0;
    }


}
