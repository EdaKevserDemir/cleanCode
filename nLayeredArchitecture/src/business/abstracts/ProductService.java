package business.abstracts;

import entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product>getAll();
}
