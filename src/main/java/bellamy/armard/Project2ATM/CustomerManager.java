package bellamy.armard.Project2ATM;
import java.util.ArrayList;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class CustomerManager {

    private ArrayList<Customer> customerList;

    public CustomerManager(){
        this.customerList = new ArrayList<Customer>();
    }

    public void addCustomer(String name, int pin){
        customerList.add(new Customer(name, pin));
    }

    public Customer getCustomer(int currentUserID){
        for (Customer customer: customerList){
            if (customer.getCustomerID() == currentUserID){
                return customer;
            }
        }
        return null;
    }
}
