package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        do {
            System.out.println("Please enter the radius for the circle: ");

            Circle circle = new Circle(input.getDouble());
            System.out.println("Radius: " + circle.getRadius());

            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());

            System.out.println("Would you like to enter another radius for a new circle");
        } while (input.yesNo(input.getString()));

        System.out.printf("You calculated the radii for %d circles!", Circle.numberOfCircles());

    }
}
