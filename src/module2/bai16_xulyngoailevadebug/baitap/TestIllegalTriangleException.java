package module2.bai16_xulyngoailevadebug.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class TestIllegalTriangleException {
    public static boolean checkThreeLengths(double firstLength, double secondLength, double thirdLength) throws IllegalTriangleException {

        boolean isTriangle = true;
        if (firstLength <= 0 || secondLength <= 0 || thirdLength <= 0) {
            isTriangle = false;
            //ném ra exception tự định nghĩa
            throw new IllegalTriangleException("Invalid number! Please input the length > 0");
        } else if (firstLength + secondLength <= thirdLength || firstLength + thirdLength <= secondLength || secondLength + thirdLength <= firstLength) {
            isTriangle = false;
            throw new IllegalTriangleException("This is not a triangle");
        }
        return isTriangle;
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first length: ");
        double firstLength = Double.parseDouble(scanner.nextLine());
        System.out.println("Input the second length: ");
        double secondLength = Double.parseDouble(scanner.nextLine());
        System.out.println("Input the third length: ");
        double thirdLength = Double.parseDouble(scanner.nextLine());

        checkThreeLengths(firstLength,secondLength,thirdLength);
    }
}
