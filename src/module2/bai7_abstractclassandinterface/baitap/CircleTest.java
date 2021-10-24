package module2.bai7_abstractclassandinterface.baitap;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(6);
        System.out.println("The area of the circle: " + circle.getArea());
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many percent (%) you want to resize?");
    int percent = Integer.parseInt(scanner.nextLine());
    circle.resize(percent);
    }
}
