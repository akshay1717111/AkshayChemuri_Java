package com.FullStackJava.week1;

public class Student {
    String name="Akshay Kumar";
    void getName(){
        System.out.println(name);
    }
    void setName(String newName){
        name=newName;
        System.out.println(newName);
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.getName();
        s.setName("Chemuri");
    }
}
