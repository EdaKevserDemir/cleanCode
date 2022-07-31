package dataAccess.concretes.ef;

import dataAccess.abstracts.IProductDal;
import entities.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class EfProductDal implements IProductDal {
    @Override
    public List<Product> getAll() {
        return new ArrayList<>();
    }
}
