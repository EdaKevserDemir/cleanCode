package ui;

import business.abstracts.CustomerService;
import business.concretes.CustomerManager;
import core.adapter.KpsServiceAdapter;
import dataAccess.concretes.EfCustomerDal;
import entities.concretes.Customer;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService=new CustomerManager(new EfCustomerDal(),new KpsServiceAdapter());
        customerService.add(new Customer());
    }
}
