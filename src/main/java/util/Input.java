package util;
import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    public String getString() {
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public int getInt() {
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            System.out.println("Did not enter a valid number value.");
            return getInt();
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            System.out.println("Did not enter a valid number value.");
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        try {
            int input = Integer.parseInt(getString());
            if (input >= min && input <= max) {
                return input;
            }
            System.out.printf("Not between %d and %d.%n", min, max);
        } catch (Exception e ) {
            System.out.println("Did not enter a valid number value.");
        }
        return getInt(min, max);
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        try {
            int input = Integer.parseInt(getString());
            if (input >= min && input <= max) {
                return input;
            }
            System.out.printf("Not between %d and %d.%n", min, max);
        } catch (Exception e ) {
            System.out.println("Did not enter a valid number value.");
        }
        return getInt(min, max);
    }

    public double getDouble() {
        try {
            return Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            System.out.println("Did not enter a valid number value.");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        try {
            return Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            System.out.println("Did not enter a valid number value.");
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        try {
            double input = Double.parseDouble(getString());
            if (input >= min && input <= max) {
                return input;
            }
            System.out.printf("Not between %f and %f.%n", min, max);
        } catch (Exception e ) {
            System.out.println("Did not enter a valid number value.");
        }
        return getDouble(min, max);
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        try {
            double input = Double.parseDouble(getString());
            if (input >= min && input <= max) {
                return input;
            }
            System.out.printf("Not between %f and %f.%n", min, max);
        } catch (Exception e ) {
            System.out.println("Did not enter a valid number value.");
        }
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