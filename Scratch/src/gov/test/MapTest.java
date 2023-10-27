package gov.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Double> gpaMap = new HashMap<>();

        gpaMap.put("scott", 2.2);
        gpaMap.put("udyr", 2.9);
        gpaMap.put("gage", 3.8);
        gpaMap.put("titus", 3.6);
        gpaMap.put("aaron", 0.08);
        gpaMap.put("keith", 3.86);

        double scottGPA = gpaMap.get("scott");  //returns the Double next to String "scott"

        dump(gpaMap);
        System.out.println();

        Collection<Double> gpas = gpaMap.values();
        for (Double gpa : gpas) {
            if (gpa >= 3.5) {
                System.out.println(gpa);
            }
        }
        System.out.println();

        for (var entry : gpaMap.entrySet()) {
            if(entry.getValue() > 2.75) {
                System.out.println("Name: " + entry.getKey() + ", GPA: " + entry.getValue());
            }
        }

    }

    private static void dump(Map<String, Double> map) {
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", GPA: " + entry.getValue());
        }
    }


}

