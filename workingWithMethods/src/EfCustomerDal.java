public class EfCustomerDal implements ICustomerDal {
    public void add(Customer customer){
        System.out.println("Added in database with EntityFramework");
    }

    @Override
    public boolean customerExist(Customer customer) {
        System.out.println("Customer is already exist");
        return true;
    }


}
