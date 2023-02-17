package grades;

import java.util.*;
import java.util.HashMap;
import util.Input;

public class GradesApplication {

    private static HashMap<String ,Student> students;
    private static Set<String> keys;
    private static Input userInput;

    public static void main(String[] args) {
        start();
        do {
            displayStudents();

            userInput = new Input();

            findStudentKey(userInput.getString());

        } while (anotherStudent());

        System.out.println("\nGoodbye, and have a wonderful day!");

    }

    public static void start() {
        students = new HashMap<>();

        Student matt = new Student("Matt");
        matt.addGrade(90);
        matt.addGrade(85);
        matt.addGrade(100);
        students.put("matty-patty", matt);

        Student stephen = new Student("Stephen");
        stephen.addGrade(75);
        stephen.addGrade(80);
        stephen.addGrade(95);
        students.put("mashed-potatoes", stephen);

        Student alex = new Student("Alex");
        alex.addGrade(10);
        alex.addGrade(35);
        alex.addGrade(20);
        students.put("captn-alex", alex);

        Student shawn = new Student("Shawn");
        shawn.addGrade(30);
        shawn.addGrade(60);
        shawn.addGrade(90);
        students.put("banana-bread", shawn);

        keys = students.keySet();

        System.out.println("""
                Welcome!
                """);
    }

    public static void displayStudents() {
        System.out.println("""                                
                Here are the GitHub usernames of our students:\040
                """);

        for (String key : keys) {
            System.out.print("|" + key + "| ");
        }

        System.out.print("""
                
                
                What student would you like to see more information on?
                
                >\040""");
    }

    public static void findStudentKey(String input) {
        for (String key : keys) {
            if (input.equals(key)) {
                getStudentInfo(key);
                return;
            }
        }
        System.out.println("\nSorry, no student found with the GitHub username of \"" + input + "\".");

    }

    public static void getStudentInfo(String key) {
        Student correctStudent = students.get(key);
        System.out.println("\nName: " + correctStudent.getName() + " - GitHub Username: " + key +
                "\nCurrent Average: " +  correctStudent.getGradeAverage());
    }

    public static boolean anotherStudent() {
        System.out.println("\nWould you like to see another student?\n");

        return userInput.yesNo(userInput.getString());
    }
}
