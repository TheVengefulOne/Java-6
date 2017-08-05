package main.java.com.Alexandr.practice.modul09.task01;

import main.java.com.Alexandr.practice.modul04.task01.Currency;
import main.java.com.Alexandr.practice.modul07.task01.Order;
import main.java.com.Alexandr.practice.modul07.task01.User;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Created by admin on 05.08.2017.
 */
public class MainSet {
    public static void main(String[] args) {
        User user1 = new User(11111,"Grisha", "Smirnov","Severodoneck",2500);
        User user2 = new User(22222,"Petya","Kovalev","Mariupol",1200);
        User user3 = new User(33333, "Gena","Faraonov","Moscow",10000);
        User user4 = new User(44444,"Ivan", "Atchalko","Kharkov",3400);
        User user5 = new User(55555,"Leonid","Petrov","Chelyabinsk",320);
        User user6 = new User(66666,"Valera","Kosyakov","Donetsk",500000);
        User user7 = new User(77777,"Pasha","Morozov","Kiev",12344);
        User user8 = new User(88888,"Andrei","Sedoi","Praha",5678);
        User user9 = new User(99999,"Alexei","Onopko","Rybezhnoe",8765);
        User user10 = new User(100000,"Alexandr","Nikolaenko","Lvov", 452623);

        Set<Order> set = new TreeSet<>();

        set.add(new Order(111,150, Currency.USD,"Item1","Indificator1", user1));
        set.add(new Order(111,150, Currency.UAH,"Item2","Indificator2", user2));
        set.add(new Order(111,150, Currency.USD,"Item3","Indificator3", user3));
        set.add(new Order(111,150, Currency.EUR,"Item4","Indificator4", user4));
        set.add(new Order(111,150, Currency.USD,"Item5","Indificator5", user5));
        set.add(new Order(111,150, Currency.EUR,"Item6","Indificator6", user6));
        set.add(new Order(111,150, Currency.USD,"Item7","Indificator7", user7));
        set.add(new Order(111,150, Currency.USD,"Item8","Indificator8", user8));
        set.add(new Order(111,150, Currency.UAH,"Item9","Indificator9", user9));
        set.add(new Order(111,150, Currency.USD,"Item10","Indificator10", user10));

        findPetrov(set);
        delUSD(set);
    }
    private static void delUSD(Set<Order> set) {
        set.stream()
                .filter(order -> order.getCurrency()!= Currency.USD)
                .collect(Collectors.toSet());
    }

    private static void findPetrov(Set<Order> set) {
        List<Order> res = set.stream()
                .filter(order -> order.getUser().getLastName().equals("Petrov"))
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
