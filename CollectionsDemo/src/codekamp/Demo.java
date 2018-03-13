package codekamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> a = new LinkedList<String>();
        a.add("Hello");
        a.add("world");
        a.add("Java");

        a.add(1, "codekamp");

        System.out.println(a);
        System.out.println(a.contains("something"));
        System.out.println(a.isEmpty());


        for (int i = 0; i < a.size(); i++) {
            System.out.println("Element at index " + i + ": " + a.get(i));
        }

        for (String b:a) {
            System.out.println(b);
        }

        List<String> students = Student.getNames();

        System.out.println(students.isEmpty());

        HashMap<String, Integer> population = new HashMap<String, Integer>();

        population.put("india", 1000);
        population.put("pakistan", 5);

        System.out.println(population.get("pakistan"));


    }
}