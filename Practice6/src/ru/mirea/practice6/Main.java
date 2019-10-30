package ru.mirea.practice6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(19, "Oleg", 112, 100));
        students.add(new Student(18, "Aleksandr", 1, 80));
        students.add(new Student(21, "Anton", 23, 75));
        students.add(new Student(19, "Andrey", 14, 79));

        System.out.println("Array before sort: " + students);
        Collections.sort(students, Student.IDcomparator);
        System.out.println("Array before sort: " + students);

        Collections.sort(students, Student.GPAComparator);
        System.out.println("Array before sort: " + students);
    }
}
