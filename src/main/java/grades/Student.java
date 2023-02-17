package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Student {

    private final String name;
    private final ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    private Set<String> attendanceKeys;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for (Integer grade : this.grades) {
            total += grade;
        }
        return total / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    public void recordAttendance(String date, String value) {
        if (date.length() != 10 && date.indexOf(4) != '-' && date.indexOf(7) != '-') {
            System.out.println("Invalid input. (YYYY-MM-DD only)");
        }
        if (!value.equals("A") && !value.equals("P")) {
            System.out.println("Invalid input. (\"A\" or \"P\" only)");
            return;
        }
        this.attendance.putIfAbsent(date, value);
    }

//    public double attendancePercentage() {
//        double absenceDays = 0;
//        for (String key : )
//        return attendance.size();
//    }
}
