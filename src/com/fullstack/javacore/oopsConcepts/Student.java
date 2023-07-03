package com.fullstack.javacore.oopsConcepts;

public class Student {
    String name;

     public String getName(){
        return name;
    }
    public String setName(String value){
        name=value;
        return name;
    }
    public static void main(String[] args){
        Student s=new Student();
        System.out.println(s.setName("akshay"));
        System.out.println(s.getName());

    }
}
