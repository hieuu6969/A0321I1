package module2.bai6_kethua.baitap;

public class Cylinder extends Circle{
    double height;
    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius);
        this.color = color;
        this.height = height;
    }

    public String getColor() {
        return this.getColor();
    }

    public void setColor(String color) {
        this.setColor(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
