package refactoring.human;

import java.util.Date;

public class Student extends UniversityPerson {

    private double averageGrade;
    private int course;
    private Date beginningOfSession;
    private Date endOfSession;

    public Student(String name, int age, double averageGrade) {

        super(name, age);
        this.averageGrade = averageGrade;
    }


    public void incAverageGrade(double delta) {
        setAverageGrade(getAverageGrade() + delta);
    }


    @Override
    public String getPosition() {
        return "Студент";
    }

    @Override
    public void live() {
        learn();
    }

    public void learn() {
    }


    public double getAverageGrade() {
        return averageGrade;
    }

    public int getCourse() {
        return course;
    }

    public void setBeginningOfSession(Date beginningOfSession) {
        this.beginningOfSession = beginningOfSession;
    }

    public void setEndOfSession(Date endOfSession) {
        this.endOfSession = endOfSession;
    }


    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setCourse(int course) {
        this.course = course;
    }

}