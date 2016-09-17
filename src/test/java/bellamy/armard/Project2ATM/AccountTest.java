package bellamy.armard.Project2ATM;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class AccountTest extends Account {

    Account account;


    @Before
    public void init(){
        account = new Account(Type.CHECKING, 10.00);
    }

    @Test
    public void setTypeTest(){
        Type expected = Type.CHECKING;
        Type actual = account.getType();
        Assert.assertEquals("Should return Type.CHECKING", expected, actual);

    }

    @Test
    public void getTypeTest(){
        account.setType(Type.BUSINESS);
        Type expected = Type.BUSINESS;
        Type actual = account.getType();
        Assert.assertEquals("Should return BUSINESS",expected, actual);
    }

    @Test
    public void getAccountNumberTest(){
        account = new Account(Type.CHECKING, 5000.00);
        int actual = account.getAccountNumber();
        int expected = 2;
        Assert.assertEquals("Should return 2", expected, actual);

    }

    @Test
    public void getInterestRateTest(){
        account = new Account(Type.BUSINESS, 500.00);
        double actual = account.getInterestRate();
        double expected = 0.12;
        Assert.assertEquals("Should return 0.12", expected, actual, .05);

    }
}
