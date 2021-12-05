package prototypepattern.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student jaden = new Student("jaden");
        Student jongha = new Student("jongha");
        List<Student> students = new ArrayList<>();
        students.add(jaden);
        students.add(jongha);


        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }

}
