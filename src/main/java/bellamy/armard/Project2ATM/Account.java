package bellamy.armard.Project2ATM;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class Account {

    public enum AccountType {CHECKING, SAVINGS, BUSINESS}
    private AccountType type;
    private double balance;
    private int accountNumber;
    private double interestRate;
    private static int accountNumCounter = 1;
    private int customerID;

    public Account(AccountType type, double balance){
        switch (type){
            case CHECKING:
                this.type = AccountType.CHECKING;
                break;
            case SAVINGS:
                this.type = AccountType.SAVINGS;
                break;
            case BUSINESS:
                this.type = AccountType.BUSINESS;
        }

        this.balance = balance;


        if (AccountType.SAVINGS.equals(AccountType.SAVINGS)){
            this.interestRate = 0.075;
        } else if (AccountType.BUSINESS.equals(AccountType.BUSINESS)){
            this.interestRate = 0.12;
        }

    }

    public Account(AccountType type, int customerID, double balance){
        switch (type){
            case CHECKING:
                this.type = AccountType.CHECKING;
                break;
            case SAVINGS:
                this.type = AccountType.SAVINGS;
                break;
            case BUSINESS:
                this.type = AccountType.BUSINESS;
        }
        this.customerID = customerID;
        this.balance = balance;
        this.accountNumber = accountNumCounter++;
    }

    public Account(){

    }

    public void setType(AccountType type){
        switch (type) {
            case CHECKING:
                this.type = AccountType.CHECKING;
                break;
            case SAVINGS:
                this.type = AccountType.SAVINGS;
                break;
            case BUSINESS:
                this.type = AccountType.BUSINESS;
        }
    }

    public AccountType getType(){
        return this.type;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public double getBalance(){
        return balance;
    }

    public int getCustomerID(){
        return customerID;
    }

    public void withdrawal(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

}
