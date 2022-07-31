package business.concretes;

import business.abstracts.CustomerService;
import business.abstracts.PersonService;
import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService {

    ICustomerDal customerDal;
    PersonService personService;

    public CustomerManager(ICustomerDal customerDal, PersonService personService) {
        this.customerDal = customerDal;
        this.personService=personService;
    }

    public void add(Customer customer)  {
        validateFirstNameIfEmpty(customer);
        validateIdentityIfEmpty(customer);
        checkCustomerExist(customer);
        customerDal.add(customer);
    }

    private boolean validateFirstNameIfEmpty(Customer customer) {
        boolean exist=false;
        if(!customer.firstName.isEmpty()){
            exist=true;
            System.out.println("customer has a firstname");
        }

        return exist;
    }
    private boolean validateIdentityIfEmpty(Customer customer) {
        boolean exist=false;
        if(!customer.identityNumber.isEmpty()){
            exist=true;
            System.out.println("customer has an identityNumber ");
        }
        return exist;
    }

    public void addByOtherBusiness(Customer customer)  {
        validateIdentityIfEmpty(customer);
        validateFirstNameIfEmpty(customer);
        customerDal.add(customer);
    }


    public void checkCustomerExist(Customer customer) {

        if (customerDal.customerExist(customer)) {
            System.out.println("Customer is already exist");
        }
        else System.out.println("Customer is not exist");


    }


}
