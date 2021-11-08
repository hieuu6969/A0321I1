package module2.bai12_javacollectionframework.baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void updateById(int id, String updatedName, double updatedPrice) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.get(i).setName(updatedName);
                products.get(i).setPrice(updatedPrice);
            }
        }
    }

    public void update(Product product, String updatedName, double updatedPrice){
        product.setName(updatedName);
        product.setPrice(updatedPrice);
    }

    public void delete(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.contains(product)) {
                products.remove(products.get(i));
            }
        }
    }

    public void display() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public boolean search(Product product) {
        return products.contains(product);
    }

    public boolean searchByName(String name) {
        boolean isPresent = false;
        for (int i = 0; i < products.size(); i++) {
            if (name.equals(products.get(i).getName())){
                isPresent = true;
            }
        }
        return isPresent;
    }

    public void sort() {
        Collections.sort(products, Comparator.comparing(Product::getName).thenComparing(Product::getPrice));
    }
}
