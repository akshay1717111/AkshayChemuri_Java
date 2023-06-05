package com.fullstack.javacore.week1;

public class Deploy implements NewApp,NewApp1 {
    @Override
    public void showDetails(){
        System.out.println("provide details");
    }
    public void showImplementation(){
        System.out.println("provide showImplementation details");
    }
    public static void main(String[] args){
    Deploy d=new Deploy();
    d.showDetails();
    d.showImplementation();
}}
