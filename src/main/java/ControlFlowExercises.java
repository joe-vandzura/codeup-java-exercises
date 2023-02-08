public class ControlFlowExercises {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            boolean isZero = i == 0;
            boolean isMultipleOfThree = i % 3 == 0;
            boolean isMultipleOfFive = i % 5 == 0;
            if (isZero) {
                System.out.println(i);
            } else if (isMultipleOfThree && isMultipleOfFive) {
                System.out.println("FizzBuzz");
            } else if (isMultipleOfThree) {
                System.out.println("Fizz");
            } else if (isMultipleOfFive) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
