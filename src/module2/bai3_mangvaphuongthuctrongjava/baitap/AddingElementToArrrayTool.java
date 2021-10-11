package module2.bai3_mangvaphuongthuctrongjava.baitap;

import java.util.Scanner;

public class AddingElementToArrrayTool {
    public static void main(String[] args) {
        int array[] = {12, 3, 5, 9 ,7, 2, 4, 6, 10};
        int newArray[] = new int[array.length + 1];
        int index;
        int x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Add a number: ");
            x = sc.nextInt();
            System.out.println("Index of the number: ");
            index = sc.nextInt();
            System.out.println(index + "" + x);
            if (index < 1 || index >= array.length + 1) {
                System.out.println("Unable to insert element into array");
            }
        } while (index < 1 || index >= array.length + 1);

        //add element to the array
        for (int i = 0; i < newArray.length; i++) {
            if ( i == index - 1) {
                newArray[i] = x;
                continue;
            }
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i - 1];
            }
        }

        //print the new Array with new Element
        System.out.printf("%-20s%s","The new array: ", "");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }
}
