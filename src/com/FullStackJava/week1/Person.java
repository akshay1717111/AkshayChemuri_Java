package com.FullStackJava.week1;

public class Person {
    long age;
    float weight;
    float height;

    double calculateBMI(){
        return weight/(height*height);
    }
    void walk(){
        System.out.println("person is walking");
    }
}
