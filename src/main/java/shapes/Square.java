package shapes;

public class Square extends Quadrilateral {

    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        setLength(width);
    }
}