package com.fullstack.javacore.week4.Day17;

public class StudentData {
    private String FN;
    private String LN;
    private double GPA;


    public StudentData(String FN, String LN, double GPA) {
        this.FN = FN;
        this.LN = LN;
        this.GPA = GPA;
    }

    public String toString() {
        return "Students{" +
                "FN='" + FN + '\'' +
                ", LN='" + LN + '\'' +
                ", GPA=" + GPA +
                '}';
    }

}
