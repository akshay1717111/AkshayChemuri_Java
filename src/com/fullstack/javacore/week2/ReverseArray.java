package com.fullstack.javacore.week2;


public class ReverseArray {

    public void reverseArr(int[] arr){
        for(int i=arr.length;i>0;i--){
          System.out.print(i + "  ");
        }
    }

    public static void main(String[] args){
        ReverseArray r=new ReverseArray();
        int arr[]={1,2,3,4,5};
        r.reverseArr(arr);

    }
}
