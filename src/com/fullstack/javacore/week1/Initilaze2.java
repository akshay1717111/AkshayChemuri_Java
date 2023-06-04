package com.fullstack.javacore.week1;

public class Initilaze2 extends Initilaze1{
    int newValue;
    Initilaze2(){
        value=12;
        newValue=14;
        System.out.println(value);
        System.out.println(newValue);


    }
    Initilaze2(int addedValue){
        newValue=addedValue;
        System.out.println(newValue);

    }
    public static void main(String[] args){
        Initilaze2 i=new Initilaze2();
        Initilaze2 i1=new Initilaze2(16);
    };
}
