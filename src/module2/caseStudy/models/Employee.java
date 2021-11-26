package module2.caseStudy.models;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private String degree;
    private String position;
    private int salary;

    public Employee(int id,
                    String name,
                    String dateOfBirth,
                    String sex,
                    String idCardNum,
                    String tel,
                    String email,
                    String degree,
                    String position,
                    int salary) {
        super(id, name, dateOfBirth, sex, idCardNum, tel, email);
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String degree, String position, int salary) {
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
