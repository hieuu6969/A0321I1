package module2.bai6_kethua.baitap;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(10, "red");
        System.out.println(circle);
        System.out.println("The area of the circle is " + circle.getArea());

    }
}
