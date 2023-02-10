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
        Scanner integerScanner = new Scanner(System.in);

        int userNum = integerScanner.nextInt();

        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        System.out.println("You did not enter a number between 1 and 10");
        System.out.print("Enter a number between 1 and 10: ");
        return getInteger(1, 10);
    }

    public static long getFactorial(int numInput, int tracker) {
        if (numInput == 1 || numInput == 2) {
            return numInput;
        }
        do {
            tracker--;
            numInput *= tracker;
        } while (tracker > 1);
        return numInput;
    }

    public static int numOfSides() {
        Scanner diceScanner = new Scanner(System.in);

        System.out.println("Please enter a the number of sides for your dice.");


        int numOfSidesInput;
        do {
            numOfSidesInput = diceScanner.nextInt();
        } while (numOfSidesInput > 6 || numOfSidesInput < 1);
        System.out.println("Your number of sides is: " + numOfSidesInput);
        return numOfSidesInput;
    }

    public static boolean yesOrNo() {
        Scanner yesOrNoScanner = new Scanner(System.in);
        String userInput;
        do {
            userInput = yesOrNoScanner.nextLine();
        } while (!userInput.equalsIgnoreCase("yes") && !userInput.equalsIgnoreCase("no"));
        return userInput.equalsIgnoreCase("yes");
    }

    public static void rollTheDice(int numOfSides) {
        int rollTotal = 0;
        for (int i = 0; i < 2; i++) {
            int roll = (int) Math.round(Math.random() * (numOfSides - 1) + 1);
            rollTotal += roll;
            System.out.println("Roll " + (i + 1) + ": " + roll);
        }
        System.out.println("Roll Total: " + rollTotal);
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

        System.out.println("Factorial for your number: " + getFactorial(userInput, userInput));


        int numOfSides = numOfSides();

        System.out.println("Do you want to roll with these dice? (YES or NO)");

        boolean wannaRoll = yesOrNo();

        if (wannaRoll) {
            do {
                rollTheDice(numOfSides);
                System.out.println("Wanna roll again?");
                wannaRoll = yesOrNo();
            } while (wannaRoll);
        } else {
            System.out.println("Aw, ok...");
        }

        System.out.println("Goodbye!");







    }
}
