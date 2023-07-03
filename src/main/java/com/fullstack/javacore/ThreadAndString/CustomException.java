package com.fullstack.javacore.ThreadAndString;

class NewException extends RuntimeException{
    NewException(String s){
        super(s);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int x;
        try{
            x= 10/0;
            System.out.println(x);
        }catch(RuntimeException e){
            throw new NewException("customized Exception");
     }
    }



}
