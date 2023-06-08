package com.fullstack.javacore.week2.Day06;

public class FizzBuzz {
    public void implementFizzBuzz(){
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i +": "+ "FizzBuzz");
            }
            else if(i%3==0){
                System.out.println(i+":"+ "Fizz");
            }
            else if(i%5==0){
                System.out.println(i+":"+"Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
