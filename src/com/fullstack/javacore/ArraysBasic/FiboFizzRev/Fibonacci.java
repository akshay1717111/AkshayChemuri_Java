package com.fullstack.javacore.ArraysBasic.FiboFizzRev;

public class Fibonacci {
    public void termForFibonacci(){
        int n1=0,n2=1;
        System.out.print(n1 + "  ");
        System.out.print(n2 + "  ");
        int n3;
        for(int i=0;i<8;i++){
            n3=n1+n2;
            System.out.print(n3 + "  ");
            n1=n2;
            n2=n3;

        }
    }
}
