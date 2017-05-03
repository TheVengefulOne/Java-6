package main.java.com.Alexandr.testPackage;

import java.util.*;

/**
 * Created by admin on 16.04.2017.
 */
public class Test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("aaa");
        set.remove("ccc");

        List<String> list = new ArrayList<>(set);
        list.add("bbb");

        System.out.println(list);

        int a = 1 << 8;
        System.out.println(a);
        System.out.println("Vsem kuku");

        Set<Integer> integers = Collections.newSetFromMap(new HashMap<>());
    }
}