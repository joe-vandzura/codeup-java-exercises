import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to go up to? ");

        int userNum = scanner.nextInt();
        System.out.println("");

        System.out.println("Here is your table\n\nnumber | squared | cubed\n------ | ------- | ------");

        for (int i = 1; i <= userNum; i++) {
            System.out.printf("%-7s| %-8s| %s%n", i, i * i, i * i * i);
        }

    }
}
