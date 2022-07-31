package dataAccess.concretes.ef;

import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

public class EfCustomerDal implements ICustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println("added db with Ef");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return false;
    }
}
