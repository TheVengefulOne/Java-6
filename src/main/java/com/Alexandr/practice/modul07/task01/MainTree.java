package main.java.com.Alexandr.practice.modul07.task01;

import com.sun.org.apache.xpath.internal.operations.Or;
import main.java.com.Alexandr.practice.modul04.task01.Currency;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

/**
 * Created by admin on 18.04.2017.
 */
public class MainTree {
    public static void main(String[] args) {
        User user1 = new User(11111, "Grisha", "Smirnov", "Severodoneck", 2500);
        User user2 = new User(22222, "Petya", "Kovalev", "Mariupol", 1200);
        User user3 = new User(33333, "Gena", "Faraonov", "Moscow", 10000);
        User user4 = new User(44444, "Ivan", "Atchalko", "Kharkov", 3400);
        User user5 = new User(55555, "Leonid", "Petrov", "Chelyabinsk", 320);
        User user6 = new User(66666, "Valera", "Kosyakov", "Donetsk", 500000);
        User user7 = new User(77777, "Pasha", "Morozov", "Kiev", 12344);
        User user8 = new User(88888, "Andrei", "Sedoi", "Praha", 5678);
        User user9 = new User(99999, "Alexei", "Onopko", "Rybezhnoe", 8765);
        User user10 = new User(100000, "Alexandr", "Nikolaenko", "Lvov", 452623);

        Set<Order> list = new TreeSet<>();

        list.add(new Order(1,200,   Currency.USD,"Item1","Idintificator1",user1));
        list.add(new Order(2,200,   Currency.UAH,"Item2","Idintificator2",user2));
        list.add(new Order(3,200,   Currency.EUR,"Item3","Idintificator3",user3));
        list.add(new Order(4,200,   Currency.UAH,"Item4","Idintificator4",user4));
        list.add(new Order(5,200,   Currency.USD,"Item5","Idintificator5",user5));
        list.add(new Order(6,200,   Currency.EUR,"Item6","Idintificator6",user6));
        list.add(new Order(7,200,   Currency.USD,"Item7","Idintificator7",user7));
        list.add(new Order(8,200,   Currency.UAH,"Item8","Idintificator8",user8));
        list.add(new Order(9,200,   Currency.USD,"Item9","Idintificator9",user9));
        list.add(new Order(9,200,   Currency.USD,"Item9","Idintificator9",user9));

        checkForPetrov(list);

        Iterator<Order> iterator = list.iterator();
        System.out.println(iterator.next());

        delUsd(list);
    }
    private static void delUsd(Set<Order> list){
        Iterator<Order> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getCurrency().equals(Currency.USD)){
                iterator.remove();
            }
        }
    }
    private static void checkForPetrov(Set<Order> list){
        for (Order order : list){
            if (order.getUser().getLastName().equals("Petrov")){
                System.out.println("Petrov was found");
            }
        }
    }

}
