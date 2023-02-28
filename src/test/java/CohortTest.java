import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {


    //Integer [] grades1 = {50, 60, 80};
    //assertArrayEquals(grades1, bob.getGrades().toArray(new Integer[grades1.length]));

    private Cohort testCohort;
    private Student testStudentOne;
    private Student testStudentTwo;

    @Before
    public void setUp() {
        testCohort = new Cohort();
        testStudentOne = new Student(111, "Joey");
        testStudentTwo = new Student(222, "Lorena");
        testCohort.addStudent(testStudentOne);
        testCohort.addStudent(testStudentTwo);
    }

    @Test
    public void testCohortInstanceCanAddStudentAndGetStudentsList() {
        Student[] expected = {testStudentOne, testStudentTwo};
        assertEquals(expected, testCohort.getStudents().toArray(new Student[expected.length]));
    }

    @Test
    public void testCohortInstanceCanGetGradesAverage() {
        testStudentOne.addGrade(100);
        testStudentTwo.addGrade(50);
        assertEquals(75, testCohort.getCohortAverage(), 0);
    }

    @Test
    public void testFindAStudentMethodWithID() {
        assertEquals(111, testStudentOne.getId());
    }

}
