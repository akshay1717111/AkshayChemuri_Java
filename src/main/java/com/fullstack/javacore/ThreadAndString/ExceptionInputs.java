package com.fullstack.javacore.ThreadAndString;

public class ExceptionInputs {
    public static Integer convertToInteger(String string)  {
        Integer c =null;
        try
        {
            c= Integer.parseInt(string);
        }catch (Exception e) {
            System.out.println("invalid input: "+ string);

        }
        return c;
    }
    public static void main(String[] args)  {
        System.out.println(convertToInteger("23"));
        Integer k=convertToInteger("test");
        Integer l=convertToInteger("123f");
       Integer m =convertToInteger("45.67");

       if(m!=null){
           System.out.println(m);
       }
        if(k!=null){
            System.out.println(k);
        }
        if(l!=null){
            System.out.println(l);
        }


    }
}
