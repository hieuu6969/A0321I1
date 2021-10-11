package module2.bai3_mangvaphuongthuctrongjava.baitap;

import java.util.Scanner;

public class MergedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The length of array 1: ");
        int length1 = sc.nextInt();
        int array1[] = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.print("Input element " + (i + 1) + " :");
            array1[i] = sc.nextInt();
        }

        System.out.println("The length of array 2: ");
        int length2 = sc.nextInt();
        int array2[] = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.print("Input element " + (i + 1) + " :");
            array2[i] = sc.nextInt();
        }
    }
}