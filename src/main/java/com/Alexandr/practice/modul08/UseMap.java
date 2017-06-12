package main.java.com.Alexandr.practice.modul08;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by admin on 23.03.2017.
 */
public class UseMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        Map treeMap = new TreeMap();
        Map linkedMap = new LinkedHashMap();

        String lastName = "Okun";
        map.put("Borovik",31);
        map.put("Scherback",228);
        map.put("Lohov", 27);
        map.put("Svinskiy", 27);
        map.put("Chmoshnikov", 228);
        map.put("Daunskiy", 27);
        map.put("Donetskiy", 228);
        map.put("Luhanksiy", 31);
        map.put("Familiya", 27);
        map.put(lastName, 31);

        System.out.println(lastName + " teaching in " + map.get(lastName) + " class");







    }
}
