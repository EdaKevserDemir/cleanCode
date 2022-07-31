package dataAccess.abstracts;

import entities.concretes.Customer;

public interface ICustomerDal {
    void add(Customer customer);
    boolean customerExist(Customer customer);
}
