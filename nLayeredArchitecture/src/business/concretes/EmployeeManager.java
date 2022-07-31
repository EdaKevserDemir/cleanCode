package business.concretes;

import business.abstracts.EmployeeService;
import dataAccess.abstracts.IEmployeeDal;
import entities.concretes.Employee;

import java.util.List;

public class EmployeeManager implements EmployeeService {
    IEmployeeDal employeeDal;

    public EmployeeManager(IEmployeeDal employeeDal) {
        this.employeeDal = employeeDal;
    }

    @Override
    public List<Employee> getAll() {
        return employeeDal.getAll();
    }
}
