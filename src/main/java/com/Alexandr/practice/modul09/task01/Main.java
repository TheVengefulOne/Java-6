package main.java.com.Alexandr.practice.modul09.task01;

import main.java.com.Alexandr.practice.modul04.task01.Currency;
import main.java.com.Alexandr.practice.modul07.task01.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by admin on 05.08.2017.
 */
public class Main {
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

        List<Order> list = new ArrayList<>();

        list.add(new Order(111,150, Currency.USD,"Item1","Indificator1", user1));
        list.add(new Order(111,150, Currency.UAH,"Item2","Indificator2", user2));
        list.add(new Order(111,150, Currency.USD,"Item3","Indificator3", user3));
        list.add(new Order(111,150, Currency.EUR,"Item4","Indificator4", user4));
        list.add(new Order(111,150, Currency.USD,"Item5","Indificator5", user5));
        list.add(new Order(111,150, Currency.EUR,"Item6","Indificator6", user6));
        list.add(new Order(111,150, Currency.USD,"Item7","Indificator7", user7));
        list.add(new Order(111,150, Currency.USD,"Item8","Indificator8", user8));
        list.add(new Order(111,150, Currency.UAH,"Item9","Indificator9", user9));
        list.add(new Order(111,150, Currency.USD,"Item10","Indificator10", user10));

        list.sort(new PriceComporator());
        list.sort(new PriceAndCity());
        list.sort(new ItemIndificatorCity());

        //     sort by price
        list.sort(((o1, o2) -> o1.getPrice() - o2.getPrice()));

        //     sort by price and city
        list.sort((o1, o2) -> {
            if(o1.getPrice() == o2.getPrice()){
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return o1.getPrice() - o2.getPrice();
        });

        //     sort by price, city and item indificator
        list.sort((o1, o2) -> {
            int r1 = o1.getItemName().compareTo(o2.getItemName());
            int r2 = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            int r3 = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            if (r1 == 0 && r2 == 0)
                return r3;
            if (r1 == 0) {
                return r2;
            } else return r1;
        });


        delDuplicates(list);
        delLessPrice(list);
        splitForTwoLists(list);
        splitForCities(list);
    }

    private static Map<String, List<Order>> splitForCities(List<Order> list) {
        return list.stream()
                .collect(Collectors.groupingBy(order -> order.getUser().getCity()));
    }


    private static Map<Currency, List<Order>> splitForTwoLists(List<Order> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Order::getCurrency));
    }

    private static void delLessPrice(List<Order> list) {
        list.stream()
                .filter(order -> order.getPrice() > 1500)
                .collect(Collectors.toList());
    }

    private static void delDuplicates(List<Order> list) {
        list.stream().distinct().collect(Collectors.toList());
    }

}
