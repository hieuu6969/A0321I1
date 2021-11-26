package module2.caseStudy.Impl;

import module2.caseStudy.models.Employee;
import module2.caseStudy.models.Facility;
import module2.caseStudy.models.Villa;
import module2.caseStudy.services.FacilityService;
import sun.awt.image.ImageWatched;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service: " + element.getKey() + " Number of Renting: " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }
//(String name,
//    double usedArea,
//    double rentExpense,
//    int maxPeople,
//    String rentType,
//    String roomStandard,
//    double poolSquare,
//    int numOfFloor)
    @Override
    public void addNewVilla() {
        System.out.println("Input Type of Facility: ");
        String name = scanner.nextLine();
        System.out.println("Input Used Area: ");
        double usedArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Input Rent Expense: ");
        double rentExpense = Double.parseDouble(scanner.nextLine());
        System.out.println("Input Maximum People: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Rent Type: ");
        String rentType = scanner.nextLine();
        System.out.println("Input Room Standard: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Input Pool Square: ");
        double poolSquare = Double.parseDouble(scanner.nextLine());
        System.out.println("Input Number of Floor: ");
        int numOfFloor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(name,usedArea,rentExpense,maxPeople,rentType,roomStandard,poolSquare,numOfFloor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("A Villa added!");

    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
