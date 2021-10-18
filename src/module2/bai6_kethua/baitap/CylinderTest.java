package module2.bai6_kethua.baitap;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(30, "Red", 30);
        System.out.println(cylinder);

        System.out.println("The volume of this Cylinder is " + cylinder.getVolume()+" m2");

    }
}
