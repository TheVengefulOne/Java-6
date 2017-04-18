package main.java.com.Alexandr.practice.modul07.task01;

import java.util.Comparator;

/**
 * Created by admin on 18.04.2017.
 */
public class PriceComporator implements Comparator<Order> {

    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
