package ui;

import business.abstracts.CustomerService;
import business.abstracts.EmployeeService;
import business.concretes.CustomerManager;
import business.concretes.EmployeeManager;
import core.adapter.KpsServiceAdapter;
import dataAccess.concretes.ef.EfCustomerDal;
import dataAccess.concretes.ef.EfEmployeeDal;
import entities.concretes.Customer;
import entities.concretes.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService=new CustomerManager(new EfCustomerDal(),new KpsServiceAdapter());
        customerService.add(new Customer(1,"eda","demir","123",1993));

        Employee employee=new Employee(1,"eda","demir","123",1993,10000);
        List<Employee>employees=new ArrayList<>();
        employees.add(employee);
        EmployeeManager employeeManager=new EmployeeManager(new EfEmployeeDal()) {
            @Override
            public List<Employee> getAll() {
                return employees;
            }
        };



    }
}
