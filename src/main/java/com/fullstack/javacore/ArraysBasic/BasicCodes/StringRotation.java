package com.fullstack.javacore.ArraysBasic.BasicCodes;
public class StringRotation
{
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate", str2 = "StrutsHibernateJavaJ2ee";

        if(str1.length() != str2.length()){
            System.out.println("Second string is not a rotation of first string");
        }
        else {
            str1 = str1.concat(str1);
             if(str1.contains(str2)) {
                 System.out.println("true");
             }
            else{
                System.out.println("false");
        }}
    }
}
