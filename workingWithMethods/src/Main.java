import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

    CustomerManager customerManager=new CustomerManager(new EfCustomerDal(),new KpsServiceAdapter() );
    Customer customer=new Customer();


    Customer customer2=new Customer();
    customerManager.add(customer);
    customerManager.add(customer2);

        System.out.println(customerManager);
    }
}
