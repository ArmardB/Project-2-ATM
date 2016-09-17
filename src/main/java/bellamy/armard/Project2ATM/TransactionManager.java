package bellamy.armard.Project2ATM;

import java.util.ArrayList;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class TransactionManager {

    private ArrayList<Transaction> transactionList;

    public TransactionManager(){
        transactionList = new ArrayList<Transaction>();
    }

    public void addTransaction(Transaction.TransType transactionType, int customerID, int accountNumber, double amount){
        transactionList.add(new Transaction(transactionType, customerID, accountNumber, amount));
    }

    public void addTransaction( int customerID, int fromAccountNumber, int toAccountNumber, double amount){
        transactionList.add(new Transaction(customerID, fromAccountNumber, toAccountNumber, amount));
    }

    public void printTransaction(){

    }
}
