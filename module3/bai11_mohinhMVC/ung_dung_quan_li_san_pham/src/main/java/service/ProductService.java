package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void update(int id, Product product);
    void save(Product product);
    void delete(int id);
    Product findById(int id);
    Product findByName(String name);
}
