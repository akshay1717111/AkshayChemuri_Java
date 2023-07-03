package com.fullstack.javacore.CollectionTopics.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (GPA: " + gpa + ")";
    }
}

public class StudentData {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add sample students to the list
        students.add(new Student("A", "B", 3.5));
        students.add(new Student("C", "D", 4.0));
        students.add(new Student("E", "F", 3.2));
        students.add(new Student("G", "H", 3.8));

        // Calculate the average GPA
        double totalGpa = 0;
        for (Student student : students) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / students.size();

        Iterator<Student> it = students.iterator();
        while(it.hasNext()) {
            Student s = it.next();
            if (s.getGpa() < averageGpa) {
                it.remove();
            }
        }



        for (Student student : students) {
            System.out.println(student);
        }
    }
}
