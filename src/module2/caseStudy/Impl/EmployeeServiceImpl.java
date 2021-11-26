package module2.caseStudy.Impl;

import module2.caseStudy.models.Employee;
import module2.caseStudy.services.EmployeeService;
import module2.caseStudy.utils.ReadAndWrite;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        employeeList = (List<Employee>) ReadAndWrite.read("D:\\A0721I1-DinhVanHieu\\src\\module2\\caseStudy\\data\\employee.cvs");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
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
        System.out.println("Input degree: ");
        String degree = scanner.nextLine();
        System.out.println("Input position: ");
        String position = scanner.nextLine();
        System.out.println("Input salary: ");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id,name, dayOfBirth, sex, idCardNum,tel, email, degree, position, salary);
        employeeList .add(employee);

        ReadAndWrite.write(employeeList,"D:\\A0721I1-DinhVanHieu\\src\\module2\\caseStudy\\data\\employee.cvs");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
