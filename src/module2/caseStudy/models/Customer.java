package module2.caseStudy.models;

public class Customer extends Person {
    private String customerType;
    private String address;


    public Customer(int id, String name, String dateOfBirth, String sex, String idCardNum, String tel, String email, String customerType, String address) {
        super(id, name,dateOfBirth,sex, idCardNum, tel, email);
        this.customerType = customerType;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
