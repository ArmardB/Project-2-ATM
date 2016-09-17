package bellamy.armard.Project2ATM;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class AccountTest {

    Account account;


    @Before
    public void init(){
        account = new Account(Account.AccountType.CHECKING, 10.00);
    }

    @Test
    public void setTypeTest(){
        Account.AccountType expected = Account.AccountType.CHECKING;
        Account.AccountType actual = account.getType();
        Assert.assertEquals("Should return Type.CHECKING", expected, actual);

    }

    @Test
    public void getTypeTest(){
        account.setType(Account.AccountType.BUSINESS);
        Account.AccountType expected = Account.AccountType.BUSINESS;
        Account.AccountType actual = account.getType();
        Assert.assertEquals("Should return BUSINESS",expected, actual);
    }

    @Test
    public void getAccountNumberTest(){
        account = new Account(Account.AccountType.CHECKING, 5000.00);
        int actual = account.getAccountNumber();
        int expected = 2;
        Assert.assertEquals("Should return 2", expected, actual);

    }

    @Test
    public void getInterestRateTest(){
        account = new Account(Account.AccountType.BUSINESS, 500.00);
        double actual = account.getInterestRate();
        double expected = 0.12;
        Assert.assertEquals("Should return 0.12", expected, actual, .05);
    }

}
