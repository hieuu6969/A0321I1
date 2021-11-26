package module2.caseStudy.Impl;

import module2.caseStudy.models.Customer;
import module2.caseStudy.models.Employee;
import module2.caseStudy.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Input ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Name: ");
        String name = scanner.nextLine();
        System.out.println("Input dateOfBirth: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Input sex: ");
        String sex = scanner.nextLine();
        System.out.println("Input idCardNum: ");
        String idCardNum = scanner.nextLine();
        System.out.println("Input Tel: ");
        String tel = scanner.nextLine();
        System.out.println("Input Email: ");
        String email = scanner.nextLine();
        System.out.println("Input Customer Type: ");
        String customerType = scanner.nextLine();
        System.out.println("Input Address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id,name, dayOfBirth, sex, idCardNum,tel, email, customerType, address);
        customerList.add(customer);
        System.out.println("Added!");

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
