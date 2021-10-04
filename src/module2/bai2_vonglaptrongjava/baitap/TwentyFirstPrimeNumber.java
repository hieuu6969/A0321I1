import sun.awt.geom.AreaOp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TwentyFirstPrimeNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the amount of Prime Number: ");
        int numbers = input.nextInt();

        int count = 0;
        int n = 2;

        while (count < numbers) {
            int i = 2;
            boolean check = true;
            while (i <= n / 2) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
