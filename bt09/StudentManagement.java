package btsession11.bt09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StudentManagement {
    ArrayList<Student> students;

    public StudentManagement(ArrayList<Student> students) {
        this.students = new ArrayList<>();
    }
    public void showAll(){
        for(Student s : students){
            System.out.println(s);
        }
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public void removeStudent(int studentId){
        this.students.remove(studentId);
    }
    public Student findStudentById(int studentId){
        for(Student s : students){
            if(s.getStudentId() == studentId){
                 return s;
            }
        }
        return null;
    }
    public void getAverageScore(){
        double average = 0;
        for(Student s : students){
            average += s.getAvarageScore();
        }
        average = average / students.size();
        System.out.println("Average score of all Student: " + average);
    }
    public void sortByScore(){
        this.students.sort(new ScoreComparerator());
    }
}
