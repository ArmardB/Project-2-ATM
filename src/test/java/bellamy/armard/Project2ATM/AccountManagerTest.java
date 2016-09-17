package bellamy.armard.Project2ATM;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class AccountManagerTest {



    @Test
    public void addAccountTest(){
        Account account = new Account(Account.AccountType.CHECKING, 500.00);
        AccountManager accountManager = new AccountManager();
        Assert.assertNotNull("Should not return null");
    }

    @Test
    public void getAccountTest(){
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(Account.AccountType.BUSINESS, 123, 500.00);
        double actual = accountManager.getAccount(123, 1).getBalance();
        double expected = 100;
        Assert.assertEquals("Should return ", expected, actual, .05);
    }

//    @Test
//    public void deleteAccountTest(){
//        Account account = new Account(Account.AccountType.BUSINESS, 500.00);
//        AccountManager accountManager = new AccountManager();
//
//
//    }


}
