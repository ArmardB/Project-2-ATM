package bellamy.armard.Project2ATM;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class Account {

    private enum Type {CHECKING, SAVINGS, BUSINESS}
    private Type type;
    private double balance;
    private int accountNumber;
    private double interestRate;
    private static int accountNumCounter = 1;

    public Account(Type type, double balance){
        switch (type){
            case CHECKING:
                this.type = Type.CHECKING;
                break;
            case SAVINGS:
                this.type = Type.SAVINGS;
                break;
            case BUSINESS:
                this.type = Type.BUSINESS;
        }

        this.balance = balance;
        this.accountNumber = accountNumCounter++;

        if (Type.SAVINGS.equals(Type.SAVINGS)){
            this.interestRate = 0.075;
        } else if (Type.BUSINESS.equals(Type.BUSINESS)){
            this.interestRate = 0.12;
        }

    }

}
