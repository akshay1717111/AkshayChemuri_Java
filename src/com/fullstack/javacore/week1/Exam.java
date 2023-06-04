package com.fullstack.javacore.week1;

public class Exam extends Department {
    int getDepartmenSize(){
        return 143;
    }
    public static void main(String[] args){
        Exam e=new Exam();
        System.out.println(e.getDepartmenSize());
    }
}
