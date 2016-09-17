package bellamy.armard.Project2ATM;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class AccountManagerTest {

    Account account;
    AccountManager accountManager;

    @Before
    public void init(){
        account = new Account(Account.Type.CHECKING, 500.00);
        accountManager = new AccountManager();
    }

    @Test
    public void addAccountTest(){
        account = new Account(Account.Type.SAVINGS, 500.00);


    }
}
