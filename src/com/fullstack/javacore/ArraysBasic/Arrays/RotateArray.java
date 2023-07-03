package com.fullstack.javacore.ArraysBasic.Arrays;

public class RotateArray {

    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int arr1[]=new int[arr.length];

    public void fromPosition(int x){
        int given=x;
            for(int i=x; i<=arr1.length; i++){
               System.out.print(x++ + " ");
            }
            for(int i=1;i<given;i++){
                System.out.print(i + " ");
            }
 }
        public static void main(String[] args){
            RotateArray r=new RotateArray();
            r.fromPosition(3);
        }
}

