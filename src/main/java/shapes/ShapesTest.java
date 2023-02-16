package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 2);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(5, 5);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

    }
}