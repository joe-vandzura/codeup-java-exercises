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

            String letterGrade;

            if (isAnA) {
                letterGrade = "A";
                if (grade % 10 > 7 && grade != 89 && grade != 88) {
                    letterGrade += "+";
                } else if (grade % 10 < 3 || grade == 89 || grade == 88) {
                    letterGrade += "-";
                }
                System.out.printf("The letter grade is: %s%n", letterGrade);
            } else if (isAB) {
                letterGrade = "B";
                if (grade % 10 > 5) {
                    letterGrade += "+";
                } else if (grade % 10 < 3) {
                    letterGrade += "-";
                }
                System.out.printf("The letter grade is: %s%n", letterGrade);
            } else if (isAC) {
                letterGrade = "C";
                if (grade % 10 > 6 && grade != 67 && grade != 68 && grade != 69) {
                    letterGrade += "+";
                } else if (grade == 67 ||grade == 68 || grade == 69) {
                    letterGrade += "-";
                }
                System.out.printf("The letter grade is: %s%n", letterGrade);
            } else if (isAD) {
                letterGrade = "D";
                if (grade % 10 > 5) {
                    letterGrade += "+";
                } else if (grade % 10 < 3) {
                    letterGrade += "-";
                }
                System.out.printf("The letter grade is: %s%n", letterGrade);
            } else {
                letterGrade = "F";
                System.out.printf("The letter grade is: %s%n", letterGrade);
            }


        } while (verify.equalsIgnoreCase("y"));

        exerciseFourScanner.close();

    }
}