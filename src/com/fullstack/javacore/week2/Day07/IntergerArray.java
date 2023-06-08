package com.fullstack.javacore.week2.Day07;

class IntegerArray {

    static int[] newArr = {10, 20, 30, 40,50,60,70};
    static int small = newArr[0];
    static int high = newArr[0];


    static void maxValue() {
        for (int i = 1; i < newArr.length ; i++) {

            if (newArr[i] > high) {
                high = newArr[i];

                //System.out.println(temp);
            }
            else if(newArr[i] < small ) {
                small = newArr[i];

                // System.out.println(temp);

            }
            else{
                System.out.println("not defined or undefined");
            }


        }
        System.out.println("Lowest: "+small);
        System.out.println("Highest: "+high);


    }
    public static void main(String[] args){
        maxValue();

    }
}
