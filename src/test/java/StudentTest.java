import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private Student testStudent;


    //Integer [] grades1 = {50, 60, 80};
    //assertArrayEquals(grades1, bob.getGrades().toArray(new Integer[grades1.length]));

    @Before
    public void setUp() {
        testStudent = new Student(111111, "Test");
    }

    @Test
    public void testStudentConstructorGetters() {
        assertEquals(111111, testStudent.getId());
        assertEquals("Test", testStudent.getName());
    }

    @Test
    public void testStudentConstructorInitializesEmptyGradesList() {
        Integer[] expected = new Integer[0];
        assertEquals( expected, testStudent.getGrades().toArray(new Integer[expected.length]));
    }



}
