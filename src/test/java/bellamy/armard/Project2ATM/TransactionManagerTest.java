package bellamy.armard.Project2ATM;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class TransactionManagerTest {

    @Test
    public void getTransactionTest(){
        TransactionManager transactionManager = new TransactionManager();
        transactionManager.addTransaction(Transaction.TransType.DEPOSIT, 1, 1 ,5);
        transactionManager.addTransaction(Transaction.TransType.WITHDRAWAL, 1, 1 ,5000.00);
        double actual = transactionManager.getTransaction(1).getAmount();
        double expected = 5.00;
        Assert.assertEquals("Should return a transaction with amount of $5.00", expected, actual, 0);


    }

    @Test
    public void addTransactionTest(){
        TransactionManager transactionManager = new TransactionManager();
        transactionManager.addTransaction(Transaction.TransType.DEPOSIT, 1, 1 ,5);
        transactionManager.addTransaction(Transaction.TransType.WITHDRAWAL, 1, 1 ,5000.00);
        Transaction.TransType actual = transactionManager.getTransaction(1).getTransType();
        Transaction.TransType expected = Transaction.TransType.DEPOSIT;
        Assert.assertEquals("Should return Transaction.TransType.DEPOSIT", expected, actual);
    }

    @Test
    public void printTransactionTest(){
        TransactionManager transactionManager = new TransactionManager();
        transactionManager.addTransaction(Transaction.TransType.DEPOSIT, 1, 1 ,5);
        transactionManager.addTransaction(Transaction.TransType.WITHDRAWAL, 1, 1 ,5000.00);
        String expected = null;
        String actual = null;
        Assert.assertEquals("Should return printout of transaction", expected, actual);
    }



}
