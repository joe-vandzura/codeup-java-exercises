import java.util.Scanner;

public class HighLow {

    public static int gameNum() {
        return (int) Math.round(Math.random() * (100 - 1) + 1);
    }

    public static int userNumber(Scanner scanner) {
        int numInput;
        do {
            System.out.print("Type in your number between 1 and 100: ");
            numInput = scanner.nextInt();
        } while (numInput > 100 || numInput < 1);
        return numInput;
    }
    public static boolean compareNumbers(int gameNum, int userNum) {
        if (userNum < gameNum) {
            System.out.println("Guess HIGHER!");
        } else if (userNum > gameNum) {
            System.out.println("Guess LOWER!");
        }
        return userNum == gameNum;
    }

    public static boolean yesOrNo(String userInput) {
        return userInput.equalsIgnoreCase("yes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guessCount = 0;

        boolean wannaPlayAgain;
        do {

            int gameNumber = gameNum();
            int userNumber;
            boolean correctGuess;

            System.out.println("Hello!\nA number between 1 and 100 has been generated and you need to guess what it is.\nInput a number between 1 and 100 and I will tell you how close you are!\nALSO, you will only be given 10 guesses!");

            do {
                if (guessCount >= 10) {
                    break;
                }

                userNumber = userNumber(scanner);

                correctGuess = compareNumbers(gameNumber, userNumber);
                guessCount++;
                System.out.println("Guess count: " + guessCount);

            } while (!correctGuess);

            if (guessCount < 10) {
                System.out.print("That's CORRECT! Good guess!");
            } else {
                System.out.println("GAME OVER! You ran out of guesses...");
            }
            System.out.println("Wanna play again? (YES or NO): ");
            scanner.nextLine();
            String userInput = scanner.nextLine();
            wannaPlayAgain = yesOrNo(userInput);
        } while (wannaPlayAgain);

        System.out.println("Thanks for playing!\nGoodbye!");
    }
}
