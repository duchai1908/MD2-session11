package btsession11.bt09;

public class Student {
    private int studentId;
    private String name;
    private double avarageScore;

    public Student() {
    }

    public Student(int studentId, String name, double avarageScore) {
        this.studentId = studentId;
        this.name = name;
        this.avarageScore = avarageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvarageScore() {
        return avarageScore;
    }

    public void setAvarageScore(double avarageScore) {
        this.avarageScore = avarageScore;
    }

}
