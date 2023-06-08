package com.fullstack.javacore.week2.Day08;
public class StringRotation
{
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate", str2 = "StrutsHibernateJavaJ2ee";

        if(str1.length() != str2.length()){
            System.out.println("Second string is not a rotation of first string");
        }
        else {
            str1 = str1.concat(str1);

             if(str1.indexOf(str2) != -1) {
                 System.out.println(str1.indexOf(str2));
                 System.out.println("true");
             }
            else{
                System.out.println("false");
        }}
    }
}
