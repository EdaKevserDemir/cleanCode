package dataAccess.concretes.ef;

import dataAccess.abstracts.IEmployeeDal;
import entities.concretes.Employee;

import java.util.ArrayList;
import java.util.List;

public class EfEmployeeDal implements IEmployeeDal {
    @Override
    public List<Employee> getAll() {
        return new ArrayList<>();
    }
}
