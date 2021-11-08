package module2.bai16_xulyngoailevadebug.thuchanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = scanner.nextInt();
        System.out.println("Input y:");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum x + y = " + a);
            System.out.println("Difference x - y = " + b);
            System.out.println("Product x * y = " + c);
            System.out.println("Quotient x / y = " + d);
        } catch (Exception e) {
            System.err.println("Exception happened: " + e.getMessage());
        }
    }
}
