package com.fullstack.javacore.week2;
import java.util.Arrays;

import java.lang.reflect.Array;

public class ReverseArray {

    public void reverseArr(int[] arr){
        for(int i=arr.length;i>0;i--){
          System.out.print(i + "  ");
        }
    }
    public void reverseAnother(){
        int newArr[]={10,20,30,40,50};
        int newArr1[]=new int[newArr.length];
        for(int i=0;i<newArr.length;i++){
            newArr1[i]=newArr[i];
        }
        System.out.println("\n" +Arrays.toString(newArr1));


    }
    public static void main(String[] args){
        ReverseArray r=new ReverseArray();
        int arr[]={1,2,3,4,5};
        r.reverseArr(arr);
        r.reverseAnother();
    }
}
