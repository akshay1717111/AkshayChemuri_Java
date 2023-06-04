package com.FullStackJava.week1;

class Exam {
    String studentName;
    String universityName;

    Integer studentID;

    public void getdetails() {
        studentName = "akshay";
        universityName = "XYZ";
        studentID = 123;
        System.out.println(
                "Name:" + studentName + "  "+"UniversityName: " + universityName+"  " +" ID: "+ studentID);
    }
}
   public class Study extends Exam{
    public void writeExam(){
        int hallTicket;
        String validSign;
        hallTicket=127;
        validSign="Department head";
        System.out.println(hallTicket+validSign);
    }
    public static void main(String[] args){
        Study s=new Study();
        s.getdetails();
        s.writeExam();

    }
}
