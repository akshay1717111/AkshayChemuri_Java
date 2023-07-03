package com.fullstack.javacore.ArraysBasic.FiboFizzRev;

public class ReverseNumber {
    public void reverseMethod(int value){
        int reverseValue=0;
        int lastDigit;
        while(value > 0){
            lastDigit = value % 10;
            reverseValue = 10* reverseValue + lastDigit;
            value/=10;
        }
        System.out.println(reverseValue);
    }
}
