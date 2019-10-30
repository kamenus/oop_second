package ru.mirea.practice6;

import java.util.Comparator;

public class Student {
    private int age;
    private String name;
    private int id;
    private int gpa;

    public Student(int age, String name, int id, int gpa) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public static Comparator<Student> IDcomparator = Comparator.comparing(Student::getId);

    public static Comparator<Student> GPAComparator = Comparator.comparingInt(Student::getGpa).reversed();

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }
}
