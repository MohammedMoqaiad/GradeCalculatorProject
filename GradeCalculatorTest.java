import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */

public class GradeCalculatorTest {
    @Test
    public void testLetterGradeA() {
        GradeCalculator calc = new GradeCalculator();
        assertEquals("A", calc.getLetterGrade(95));
    }

    @Test
    public void testLetterGradeF() {
        GradeCalculator calc = new GradeCalculator();
        assertEquals("F", calc.getLetterGrade(50));
    }

    @Test
    public void testIsPassing() {
        GradeCalculator calc = new GradeCalculator();
        assertTrue(calc.isPassing(75));
        assertFalse(calc.isPassing(55));
    }

    @Test
    public void testCalculateAverage() {
        GradeCalculator calc = new GradeCalculator();
        double[] grades = {80, 90, 100};
        assertEquals(90, calc.calculateAverage(grades));
    }

    @Test
    public void testCalculateAverageEmptyArray() {
        GradeCalculator calc = new GradeCalculator();
        double[] grades = {};
        assertEquals(0, calc.calculateAverage(grades));
    }

    private void assertEquals(String a, String letterGrade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertTrue(boolean passing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertFalse(boolean passing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(int i, double calculateAverage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
