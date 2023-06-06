package com.fullstack.javacore.week2;

public class PersonAge {
    public void ageDefination(int value){
        if(value < 13){
            System.out.println("kid");
        }
        else if(value >=13 && value <=19){
            System.out.println("teen");
        }
        else if(value >19){
            System.out.println("adult");

        }
        else{
            System.out.println("noone");
        }
    }
}
