import java.util.Scanner;

public class MethodsExercises {

    public static int addition (int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int subtraction (int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public static int multiplication (int numOne, int numTwo) {
        return numOne * numTwo;
//        int tracker = numTwo;
//        if (numOne == 0 || numTwo == 0) {
//            return 0;
//        } else if (tracker == 1) {
//            return numOne;
//        }
//        numOne += numOne;
//        tracker -= 1;
//        return multiplication(numOne, tracker);
    }

    public static int division (int numOne, int numTwo) {
        return numOne / numTwo;
    }

    public static int modulus (int numOne, int numTwo) {
        return numOne % numTwo;
    }

    public static int getInteger(int min, int max) {
        Scanner scnr = new Scanner(System.in);
        int userNum = scnr.nextInt();

        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        System.out.println("You did not enter a number between 1 and 10");
        System.out.print("Enter a number between 1 and 10: ");
        return getInteger(1, 10);
    }

    public static void main(String[] args) {

        System.out.println(addition(2, 2));
        System.out.println(subtraction(2, 2));
        System.out.println(multiplication(2, 2));
        System.out.println(division(2, 2));
        System.out.println(modulus(2, 2));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("Your number is in the range.\nHere is your number: " + userInput);

    }
}
