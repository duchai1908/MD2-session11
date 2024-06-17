package btsession11.bt09;

import java.util.Comparator;

public class ScoreComparerator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getAvarageScore() - o2.getAvarageScore());
    }
}
