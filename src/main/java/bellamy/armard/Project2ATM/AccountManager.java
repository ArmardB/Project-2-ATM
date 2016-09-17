package bellamy.armard.Project2ATM;

import java.util.ArrayList;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class AccountManager {

    private ArrayList<Account> accountList;


    public AccountManager(){
        this.accountList = new ArrayList<Account>();
    }

    public void addAccount(Account.AccountType account,int customerID, double balance){
        accountList.add(new Account(account, customerID, balance));
    }

    public Account getAccount(int customerID, int accountNumber){
        for (Account account: accountList){
            if ((account.getCustomerID() == customerID) && (account.getAccountNumber() == accountNumber)){
                return account;
            }
        }
        return null;

    }

//    public void deleteAccount(int accountNumber){
////        accountList.remove(accountNumber);
//    }
//
//    public int getAccountNumber(){
//        return accountNumber;
//    }
}
