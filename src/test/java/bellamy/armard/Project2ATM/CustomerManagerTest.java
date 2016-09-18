package bellamy.armard.Project2ATM;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class CustomerManagerTest {


    CustomerManager customerManager;


    @Before
    public void init(){
        customerManager = new CustomerManager();
    }


    @Test
    public void getCustomerTest(){
        customerManager.addCustomer("Tom Brady", 0012);
        String expected = "Tom Brady";
        String actual = customerManager.getCustomer(1).getName();
        Assert.assertEquals("Should return Tom Brady", expected, actual);
    }

    @Test
    public void addCustomerTest(){
        customerManager.addCustomer("Armard Bellamy", 1234);
        Assert.assertNotNull(customerManager.getCustomer(1));
    }




}
