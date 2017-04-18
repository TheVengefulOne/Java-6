package main.java.com.Alexandr.practice.modul07.offline;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 09.03.2017.
 */
public class UseCollection {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("Some");
        linkedList.add("Some");
        linkedList.add("Some");
        linkedList.add("Some");

        linkedList.set(1,null);

        List arrayList = new ArrayList(linkedList);

        linkedList.set(0, "Other");



        for (Object o : arrayList){
            System.out.println(o);
        }

    }
}
