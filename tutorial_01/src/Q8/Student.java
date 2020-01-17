package Q8;

/**
 * The Student class implements methods to calculate a student's grade.<br/>This should be a new line.
 *
 * @author Ling
 * @version 2020.01
 * @see
 */
public class Student {
    private int[] quizScores;
    private int midtermScore;
    private int finalScore;
    private double overallScore;
    private char grade;

    /**
     *
     */
    public void calculateOverallScore() {
        double accumulateQuizScore = 0.0;
        for (int score : quizScores) {
            accumulateQuizScore += score * 0.05;
        }

        this.overallScore = accumulateQuizScore + midtermScore * 0.35 + finalScore + 0.5;
    }

    public void finalLetterGrade() {
        if (this.overallScore >= 90) {
            this.grade = 'A';
        } else if (this.overallScore >= 80) {
            this.grade = 'B';
        } else if (this.overallScore >= 70) {
            this.grade = 'C';
        } else if (this.overallScore >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }

    public int[] getQuizScores() {
        return quizScores;
    }

    public void setQuizScores(int[] quizScores) {
        this.quizScores = quizScores;
    }

    public int getMidtermScore() {
        return midtermScore;
    }

    public void setMidtermScore(int midtermScore) {
        this.midtermScore = midtermScore;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public double getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(double overallScore) {
        this.overallScore = overallScore;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}