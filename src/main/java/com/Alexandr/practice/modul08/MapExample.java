package main.java.com.Alexandr.practice.modul08;

import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;

/**
 * Created by admin on 23.03.2017.
 */
public class MapExample {
    public static void main(String[] args) {


        Map<String,Integer> map = new HashMap<>();

        map.put("Borovik",31);
        map.put("Scherback",228);
        map.put("Lohov", 27);
        map.put("Svinskiy", 27);
        map.put("Chmoshnikov", 228);
        map.put("Daunskiy", 27);
        map.put("Donetskiy", 228);
        map.put("Luhanksiy", 31);
        map.put("Familiya", 27);
        map.put("Mda", 31);


        System.out.println(map.get("Mda"));
        System.out.println(map.containsKey("Borovik"));
        System.out.println(map.containsValue(31));
        System.out.println(map.size());
        System.out.println(map.entrySet());

        map.keySet();
        map.values();

        }
    }

