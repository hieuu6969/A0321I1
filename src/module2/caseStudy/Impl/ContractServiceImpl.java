package module2.caseStudy.Impl;

import module2.caseStudy.models.Booking;
import module2.caseStudy.models.Contract;
import module2.caseStudy.models.Customer;
import module2.caseStudy.services.ContractService;
import module2.caseStudy.services.ContractService;

import java.util.*;

public class ContractServiceImpl implements ContractService {

    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Creating a contract for a booking with the info: " + booking.toString());
            System.out.println("Creating a contract for a customer with the info: " + booking.toString());
            System.out.println("Input contract ID: ");
            String id = scanner.nextLine();
            System.out.println("Input the deposit: ");
            String deposit = scanner.nextLine();
            System.out.println("Input the price: ");
            String price = scanner.nextLine();

            Contract contract = new Contract(id, booking, deposit, price, customer);
            contractList.add(contract);
            System.out.println("Contract created!" + contract.toString());
        }
    }

    @Override
    public void displayContractList() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContract() {

    }
}
