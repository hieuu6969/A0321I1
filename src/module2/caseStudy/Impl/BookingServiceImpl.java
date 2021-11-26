package module2.caseStudy.Impl;

import module2.caseStudy.models.Booking;
import module2.caseStudy.models.Customer;
import module2.caseStudy.models.Facility;
import module2.caseStudy.models.Villa;
import module2.caseStudy.services.BookingService;
import module2.caseStudy.utils.BookingComparator;

import java.util.*;

import static module2.caseStudy.Impl.EmployeeServiceImpl.scanner;

public class BookingServiceImpl implements BookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        customerList.add(new Customer(1, "Hieu", "20/11/1998", "Male", "12312",
                "0905768493","hieu@gmail.com", "VIP", "DN"));
        customerList.add(new Customer(2, "Nam", "19/03/1990", "Male", "12312",
                "0705768493","nam@gmail.com", "ECO", "DN"));
//        String name,
//        double usedArea,
//        double rentExpense,
//        int maxPeople,
//        String rentType,
//        String roomStandard,
//        double poolSquare,
//        int numOfFloor)
        facilityIntegerMap.put(new Villa("Hoiana", 123467,999,30,
                "Daily","double",345000,5),0);
        facilityIntegerMap.put(new Villa("Riverside", 65432,888,50,
                "Monthly","triple",345000,7),0);
    }
    public Set<Booking> sendBooking() {
        return bookingSet;
    }
    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooserFacility();
        System.out.println("Input the start day: ");
        String startDate = scanner.nextLine();
        System.out.println("Input the end day: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);
        bookingSet.add(booking);
        System.out.println("Booked!");
    }

    @Override
    public void displayListBooking() {
        for (Booking booking : bookingSet){
            System.out.println(booking);
        }

    }
    public static Customer chooseCustomer() {
        System.out.println("Customer List: ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Input Customer ID: ");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());

        while (check) {
            for (Customer customer : customerList) {
                if (id == customer.getId()) {
                    check = true;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Input Customer ID: ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooserFacility() {
        System.out.println("Facility List: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Input Facility Name: ");
        boolean check = true;
        String name = scanner.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (name.equals(entry.getKey().getName())) {
                    check = true;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Input Facility name: ");
                name = scanner.nextLine();
            }
        }
        return null;
    }
}
