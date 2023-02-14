package shapes;

public class Circle {

    private double radius;
    private static int circles = 0;

    public static int numberOfCircles() {
        return circles;
    }
    public Circle(double radius) {
        circles++;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}