package business.concretes;

import business.abstracts.ProductService;
import dataAccess.abstracts.IProductDal;
import entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    IProductDal productDal;

    public ProductManager(IProductDal productDal) {
        this.productDal = productDal;
    }

    @Override
    public List<Product> getAll() {
        return productDal.getAll();
    }
}
