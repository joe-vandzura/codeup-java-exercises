import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f%n", pi);

        System.out.print("Please input a number: ");
        int numInput = scanner.nextInt();
        System.out.printf("Your number is: %d%n", numInput);

        System.out.print("Please input three words: ");

        String stringOne = scanner.next();
        String stringTwo = scanner.next();
        String stringThree = scanner.next();
        scanner.nextLine();

        System.out.printf("Your words are: %nWord One: %s%nWord Two: %s%nWord Three: %s%n", stringOne, stringTwo, stringThree);

        System.out.print("Please enter a sentence: ");

        String sentence = scanner.nextLine();

        System.out.printf("Here is your sentence: \"%s\"%n" , sentence);



        System.out.print("Please enter the length of the room (in feet): ");

        Double lengthOfRoom = scanner.nextDouble();

        System.out.print("Please enter the width of the room (in feet): ");

        Double widthOfRoom = scanner.nextDouble();

        System.out.print("Please enter the height of the room (in feet): ");

        Double heightOfRoom = scanner.nextDouble();

        System.out.println("The area of the room is: " + (lengthOfRoom * widthOfRoom) + " sq. ft\nThe perimeter of the room is: " + ( (lengthOfRoom * 2) + (widthOfRoom * 2) ) + " ft\nThe volume of the room is: " + (lengthOfRoom * widthOfRoom * heightOfRoom) + " cu ft\n");
    }
}