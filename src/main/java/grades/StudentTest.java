package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student joey = new Student("Joey");

        System.out.println(joey.getName());

        joey.addGrade(100);
        System.out.println(joey.getGradeAverage());
        joey.addGrade(50);
        System.out.println(joey.getGradeAverage());

    }
}
