package com.fullstack.javacore.oopsConcepts;

public class KeyWordStatic {
    static int a;

    static int abc(){
      a=5;
      return a;

    }
    static{
      abc();
    }
    public static void main(String[] args){
        //KeyWordStatic k=new KeyWordStatic();
        System.out.println(a);
    }
}
