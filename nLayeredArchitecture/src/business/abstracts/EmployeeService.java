package business.abstracts;

import entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
}
