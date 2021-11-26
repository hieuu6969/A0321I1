package module2.caseStudy.models;

public class Contract {
    private String id;
    private Booking booking;
    private String deposit;
    private String price;
    private Customer customer;

    public Contract() {
    }

    public Contract(String id,
                    Booking booking,
                    String deposit,
                    String price,
                    Customer customer) {
        this.id = id;
        this.booking = booking;
        this.deposit = deposit;
        this.price = price;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id='" + id + '\'' +
                ", booking=" + booking +
                ", deposit='" + deposit + '\'' +
                ", price='" + price + '\'' +
                ", customer=" + customer +
                '}';
    }
}
