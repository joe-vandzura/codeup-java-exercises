package util;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Input {

    private Scanner scanner;

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
        if (num >= min && num <= max) {
            return num;
        }
        System.out.printf("Not between %s and %s%n", min, max);
        return getInt(min, max);
    }

    public double getDouble() {
        return parseDouble(getString());
    }

    public double getDouble(int min, int max) {
        double num = parseDouble(getString());
        if (num >= min && num <= max) {
            return num;
        }
        System.out.printf("Not between %s and %s%n", min, max);
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

        System.out.println(myInput.getDouble(1, 10));
    }

}