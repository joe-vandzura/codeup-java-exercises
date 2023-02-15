package util;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    public String getString() {
        return this.scanner.nextLine();
    }

    public int getInt() {
        return parseInt(getString());
    }

    public int getInt(int min, int max) {
        int num = parseInt(getString());
        System.out.println(num);
        if (num >= min && num <= max) {
            return num;
        }
        System.out.printf("Not between %d and %d%n", min, max);
        return getInt(min, max);
    }

    public double getDouble() {
        return parseDouble(getString());
    }

    public double getDouble(double min, double max) {
        double num = parseDouble(getString());
        if (num >= min && num <= max) {
            return num;
        }
        System.out.printf("Not between %f and %f%n", min, max);
        return getDouble(min, max);
    }

    public boolean yesNo(String input) {
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("yeah");
    }

    public static void main(String[] args) {
        Input myInput = new Input();

        System.out.println(myInput.yesNo(myInput.getString()));

        System.out.println(myInput.getInt());

        System.out.println(myInput.getInt(1, 10));

        System.out.println(myInput.getDouble());

        System.out.println(myInput.getDouble(1.0, 10.0));
    }

}