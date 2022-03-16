package com.codegym.validateformdangky.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String age;
    private String email;

    public User() {
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        String phone = user.getPhone();
        String email = user.getEmail();
        int age = Integer.parseInt(user.getAge());

        ValidationUtils.rejectIfEmpty(errors,"firstName","name.empty");
        ValidationUtils.rejectIfEmpty(errors,"lastName","name.empty");

        if (firstName.length() < 5 || firstName.length() > 45) {
            errors.rejectValue("firstName","name.length");
        }
        if (lastName.length() < 5 || lastName.length() > 45) {
            errors.rejectValue("lastName","name.length");
        }

        if (!phone.matches("(^$|[0-9]*$)") || !phone.startsWith("0")) {
            errors.rejectValue("phone","phone.startsWith&Matches");
        }
        if (age < 18) {
            errors.rejectValue("age","age.min");
        }
        if (!email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
            errors.rejectValue("email","email.invalid");
        }
    }
}
