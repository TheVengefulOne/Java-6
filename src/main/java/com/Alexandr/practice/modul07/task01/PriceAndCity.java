package main.java.com.Alexandr.practice.modul07.task01;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Comparator;

/**
 * Created by admin on 18.04.2017.
 */
public class PriceAndCity implements Comparator<Order> {
    public int compare(Order o1, Order o2) {
        if(o1.getPrice() == o2.getPrice()){
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
        return o1.getPrice() - o2.getPrice();
    }
    }

