package com.fullstack.javacore.week2;

public class Main {
    public static void main(String[] args){
        ReverseNumber r=new ReverseNumber();
        PersonAge p=new PersonAge();
        Fibonacci f=new Fibonacci();
        p.ageDefination(13);
        p.ageDefination(25);
        r.reverseMethod(100);
        f.termForFibonacci(10);
        FizzBuzz f1=new FizzBuzz();
        f1.implementFizzBuzz();
    }
}
