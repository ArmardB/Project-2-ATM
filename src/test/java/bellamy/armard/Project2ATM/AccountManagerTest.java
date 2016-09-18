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
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(Account.AccountType.CHECKING, 1, 500);
        Assert.assertNotNull(accountManager.getAccount(1,1).getBalance());
    }

    @Test
    public void getAccountTest(){
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(Account.AccountType.CHECKING, 1, 100.00);
        double expected = 100.00;
        double actual = accountManager.getAccount(1, 1).getBalance();
        Assert.assertEquals("Should return ", expected, actual, 0);
    }

    @Test
    public void deleteAccountTest() {
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(Account.AccountType.BUSINESS, 1, 500);
        accountManager.addAccount(Account.AccountType.CHECKING, 1, 10000);
        accountManager.deleteAccount(1,1);
        Account expected = null;
        Account actual = accountManager.getAccount(1, 1);
        Assert.assertEquals("Should return null", expected, actual);


    }







}
