package dataAccess.abstracts;

import entities.concretes.Person;
import entities.concretes.Product;

import java.util.List;

public interface IProductDal {
    List<Product>getAll();
}
