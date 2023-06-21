package com.fullstack.javacore.week4.Day17;



import java.util.HashMap;
        import java.util.Iterator;
        import java.util.Map;
public class HashMapStudent {


    public static void main(String[] args) {

        HashMap<String, StudentData> student = new HashMap<>();

        student.put("ABC", new StudentData("ABC", "G", 3.5));
        student.put("CDE", new StudentData("CDE", "M", 3.8));
        student.put("EFG", new StudentData("EFG", "H", 3.2));
        student.put("HIJ", new StudentData("HIJ", "O", 3.9));
        student.put("KLM", new StudentData("KLM", "Q", 3.6));
        student.put("NOP", new StudentData("NOP", "E", 3.4));
        student.put("PQR", new StudentData("PQR", "T", 3.7));
        student.put("RSU", new StudentData("RSU", "Z", 3.1));


        System.out.println("using Entry Set:");
        for (Map.Entry<String, StudentData> st : student.entrySet()) {
            System.out.println("Key: " + st.getKey() + ", Value: " + st.getValue());
        }


        System.out.println("\nusing forEach method:");
        student.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("\nusing keySet and Iterator:");
        Iterator<String> iterator = student.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("Key: " + key + ", Value: " + student.get(key));
        }

    }
}
