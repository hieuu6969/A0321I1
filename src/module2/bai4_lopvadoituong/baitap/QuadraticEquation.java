package module2.bai4_lopvadoituong.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * 2 - 4 * this.a * this.c;
    }
    public double getRoot1() {
        return (- this.b + (Math.sqrt(this.getDiscriminant()))) / 2 * this.a;
    }

    public double getRoot2() {
        return (- this.b - (Math.sqrt(this.getDiscriminant()))) / 2 * this.a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(a +" " + b + " " + c);
        QuadraticEquation qe1 = new QuadraticEquation(a, b, c);
        double delta = qe1.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            System.out.println("The equation has one root: " + qe1.getRoot1());
        } else {
            System.out.println("The equation has two roots: " + qe1.getRoot1() + "and" + qe1.getRoot2());
        }
    }
}
