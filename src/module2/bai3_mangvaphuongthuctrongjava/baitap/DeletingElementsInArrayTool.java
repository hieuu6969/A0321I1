package module2.bai3_mangvaphuongthuctrongjava.baitap;

import java.util.Scanner;

public class DeletingElementsInArrayTool {
    public static void main(String[] args) {
        int array[] = {12, 3, 5, 9 ,7, 2, 4, 6, 10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value to delete: ");
        int value = sc.nextInt();

        //check the presence
        boolean check = false;
        int index;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                System.out.println("The index of the value " + value + " is " + (index +1));
                check = true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        array[array.length-1] = 0;
        if (!check) {
            System.out.println("The value is not in the array");
        } else {
            System.out.printf("%-20s%s","The new array: ", "");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
