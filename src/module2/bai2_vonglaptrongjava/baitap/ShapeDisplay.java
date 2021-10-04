package module2.bai2_vonglaptrongjava.baitap;

import java.util.Scanner;

public class ShapeDisplay {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while (choice != 4) {
            System.out.println("MENU");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = sc.nextInt();
        }

    }
}
