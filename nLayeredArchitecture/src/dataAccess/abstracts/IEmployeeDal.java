package dataAccess.abstracts;

import entities.concretes.Employee;

import java.util.List;

public interface IEmployeeDal {
    List<Employee> getAll();
}
