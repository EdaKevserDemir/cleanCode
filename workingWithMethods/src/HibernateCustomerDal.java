public class HibernateCustomerDal implements ICustomerDal{
    @Override
    public void add(Customer customer) {
        System.out.println("Added in database with Hibernate");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return true;
    }
}
