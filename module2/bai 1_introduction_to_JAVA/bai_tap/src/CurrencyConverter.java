import java.sql.SQLOutput;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double vnd = 23300;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD: ");
        usd = Double.parseDouble(sc.nextLine());
        System.out.println("VND: " + usd * vnd);
    }
}
