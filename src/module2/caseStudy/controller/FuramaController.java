package module2.caseStudy.controller;

import module2.caseStudy.Impl.*;
import module2.caseStudy.models.Contract;
import module2.caseStudy.models.Customer;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) throws IOException {
        displayMenu();
    }
    static public void displayMenu() throws IOException {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Format Input! Please input again");
            }
            switch (choice) {
                case 1:
                    displayEmployeeManagementMenu();
                    break;
                case 2:
                    displayCustomerManagementMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
            }
        }
    }

    public static void displayEmployeeManagementMenu() throws IOException {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee ");
            System.out.println("4.Return main menu");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
            }
        }
    }

    public static void displayCustomerManagementMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1.Display list customer");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer ");
            System.out.println("4.Return main menu");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
            }
        }
    }

    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list maintain-required facility");
            System.out.println("4.Return main menu");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    break;
            }
        }
    }

    public static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Add a new Villa");
            System.out.println("2. Add a new House");
            System.out.println("3. Add a new Room");
            System.out.println("4.Return main menu");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    displayFacilityMenu();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    displayFacilityMenu();
                    break;
            }
        }
    }

    public static void displayBookingMenu() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contracts\n" +
                    "4.\tDisplay list contract\n" +
                    "5.\tEdit contract\n" +
                    "6.\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    bookingService.addBooking();
                    displayBookingMenu();
                    break;
                case 2:
                    bookingService.displayListBooking();
                    displayBookingMenu();
                    break;
                case 3:
                    contractService.createNewContract();
                    displayBookingMenu();
                    break;
                case 4:
                    contractService.displayContractList();
                    displayBookingMenu();
                    break;
            }
        }
    }
}
