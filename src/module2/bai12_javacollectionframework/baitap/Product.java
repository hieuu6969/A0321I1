package module2.bai12_javacollectionframework.baitap;

public class Product implements Comparable<Product>{
    private String id;
    private String name;
    private double price;

    public Product(){
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                " id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return 0;
    }
}
