package dataAccess.concretes;

import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

public class nHibernate implements ICustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println("added db with NH");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return false;
    }
}
