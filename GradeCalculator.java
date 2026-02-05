/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class GradeCalculator {
   
    public String getLetterGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    public boolean isPassing(double percentage) {
        return percentage >= 60;
    }

    public double calculateAverage(double[] grades) {
        if (grades.length == 0) return 0;
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }
}

    

