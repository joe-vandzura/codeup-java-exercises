import org.apache.commons.lang3.StringUtils;
import util.Input;

public class MavenExercise {
    public static void main(String[] args) {
        Input input = new Input();

        String userString = input.getString("Enter something: ");
        System.out.println("\"" + userString + "\" " + isNumber(userString));
        System.out.println("You entered: \"" + userString + "\"");
        System.out.println("Flipped case: \"" + StringUtils.swapCase(userString) + "\"");
        System.out.println("Reversed: \"" + StringUtils.reverse(userString) + "\"");
    }

    public static String isNumber(String input) {
        if (StringUtils.isNumeric(input)) {
            return "is a number";
        }
        return "is not a number";
    }
}
