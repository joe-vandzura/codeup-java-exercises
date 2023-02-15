package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side);
    }

    public int getPerimeter() {
        System.out.println("USED SQUARE FUNCTION");
        return (4 * this.length);
    }

    public int getArea() {
        System.out.println("USED SQUARE FUNCTION");
        return (int) Math.pow(this.length, 2);
    }
}