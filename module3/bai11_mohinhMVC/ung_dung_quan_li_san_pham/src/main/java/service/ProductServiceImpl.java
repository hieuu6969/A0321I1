package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements  ProductService {
    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Red Rose Grand Bouquet","39",
                "Surprise your loved ones with this large-scale pop-up bouquet—the most beautiful gift for any occasion",
                "US"));
        products.put(2,new Product(2,"Handcrafted Paper Flowers","69",
                "Everlasting, intricate, and one-of-a-kind—make their heart skip a beat with our brand new Handcrafted Paper Flowers.",
                "France"));
        products.put(3,new Product(3,"Pansies Pop-Up Card","13",
                "Surprise the guest of honor with a sentiment that really pops!",
                "Vietnam"));
        products.put(4,new Product(4,"Birthday Celebration Pop-Up Card","13",
                "This fabulous design is all about the joy, laughter, and cheer that a birthday brings.",
                "China"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }
}
