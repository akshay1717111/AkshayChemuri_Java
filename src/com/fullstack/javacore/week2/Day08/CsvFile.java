package com.fullstack.javacore.week2.Day08;
import java.io.*;
import java.util.*;


class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.getLastName());
    }
}

public class CsvFile {
    public static void main(String[] args) {
        String csvFile = "C://Users//Akshay Kumar//IdeaProjects//Java//src//com//fullstack//javacore//week2//Day08//CSV_read.csv";
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String firstName = data[0].trim();
                String lastName = data[1].trim();
                double gpa = Double.parseDouble(data[2].trim());
                Student student = new Student(firstName, lastName, gpa);
                students.add(student);
            }

            Collections.sort(students);

            for (Student student : students) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + ", GPA: " + student.getGpa());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


