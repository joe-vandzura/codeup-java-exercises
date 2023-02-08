import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner exerciseFourScanner = new Scanner(System.in);

        String verify;
        do {

            do {
                System.out.print("Would you like to enter a grade? (Enter Y or N): ");
                verify = exerciseFourScanner.next();
                exerciseFourScanner.nextLine();
            } while (!verify.equalsIgnoreCase("y") && !verify.equalsIgnoreCase("n"));

            if (verify.equalsIgnoreCase("n")) {
                System.out.println("Goodbye!");
                break;
            }

            int grade;
            do {
                System.out.println("Please enter a numerical grade from 0 to 100: ");
                grade = exerciseFourScanner.nextInt();
            } while ((grade < 0) || (grade > 100));


            boolean isAnA = grade >= 88;
            boolean isAB = (grade <= 87) && (grade >= 80);
            boolean isAC = (grade <= 79) && (grade >= 67);
            boolean isAD = (grade <= 66) && (grade >= 60);
            boolean isAnF = grade <= 59;

            boolean isAPlus = grade % 10 >= 8;
            boolean isAMinus = grade % 10 <= 2;

            String letterGrade;

            if (isAnA) {
                letterGrade = "A";
                if (isAPlus) {
                    letterGrade += "+";
                } else if (isAMinus) {
                    letterGrade += "-";
                }
                System.out.printf("The letter grade is: %s", letterGrade);
            } else if (isAB) {
                letterGrade = "B";
                if (isAPlus) {
                    letterGrade += "+";
                } else if (isAMinus) {
                    letterGrade += "-";
                }
                System.out.printf("The letter grade is: %s", letterGrade);
            } else if (isAC) {
                letterGrade = "C";
                if (isAPlus) {
                    letterGrade += "+";
                } else if (isAMinus) {
                    letterGrade += "-";
                }
                System.out.printf("The letter grade is: %s", letterGrade);
            } else if (isAD) {
                letterGrade = "D";
                if (isAPlus) {
                    letterGrade += "+";
                } else if (isAMinus) {
                    letterGrade += "-";
                }
                System.out.printf("The letter grade is: %s", letterGrade);
            } else if (isAnF) {
                letterGrade = "F";
                System.out.printf("The letter grade is: %s", letterGrade);
            }

            System.out.println("");


        } while (verify.equalsIgnoreCase("y"));

        exerciseFourScanner.close();

    }
}