import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yeighOrNeigh;
        String something;

        do {
            System.out.print("PSSSST. You wanna something to Bob... (Y or N): ");
            yeighOrNeigh = scanner.nextLine();
        } while ( !yeighOrNeigh.equalsIgnoreCase("y") && (!yeighOrNeigh.equalsIgnoreCase("n")) );

        if (yeighOrNeigh.equalsIgnoreCase("n")) {
            System.out.println("Yeah, me neither.");
        } else {

            do {
                System.out.println("Alright, go ahead...");

                something = scanner.nextLine();

                if (something.endsWith("?")) {
                    System.out.println("Bob: \"Sure...\"");
                } else if (something.endsWith("!")) {
                    System.out.println("Bob: \"Whoa, chill out!\"");
                } else if (something.trim().equals("")) {
                    System.out.println("Bob: \"Fine! Be that way!\"");
                } else {
                    System.out.println("Whatever...");
                }

                do {
                    System.out.println("Anything else you wanna say? (Y or N)");

                    yeighOrNeigh = scanner.nextLine();
                } while (!yeighOrNeigh.equalsIgnoreCase("y") && !yeighOrNeigh.equalsIgnoreCase("n"));

            } while ( yeighOrNeigh.equalsIgnoreCase("y"));
        }

        System.out.println("Alright, see ya Bob!");

    }
}
