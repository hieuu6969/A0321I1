package module2.bai3_mangvaphuongthuctrongjava.thuchanh;

import java.util.Scanner;

public class NameSearcher {
    public static void main(String[] args) {
        String[] students = {"Elana", "Michael", "Shreyash"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String inputName = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of " + inputName + " in the list is: " + (i + 1));
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + inputName + " in the list");
        }
    }
}
