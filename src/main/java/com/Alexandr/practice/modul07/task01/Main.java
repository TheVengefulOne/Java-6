package main.java.com.Alexandr.practice.modul07.task01;

import main.java.com.Alexandr.practice.modul04.task01.Currency;

import java.util.*;

/**
 * Created by admin on 16.04.2017.
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





        delDuplicates(list);
        delLessPrices(list);
        splitByCurrency(list);
        splitByCity(list);
    }
    private static List<List<Order>> splitByCity(List<Order> list){
        List<List<Order>> uniqueCityList = new ArrayList<>();
        Set<String> uniqueCities = new HashSet<>();
        for(Order order : list){
            String city = order.getUser().getCity();
            if(uniqueCities.add(city)){
                List<Order> currentList = new ArrayList<>();
                currentList.add(order);
                uniqueCityList.add(currentList);
            }
            else {
                int index = 0;
                for (List<Order> orders : uniqueCityList){
                    if (orders.get(index).getUser().getCity().equals(city)){
                        uniqueCityList.get(index).add(order);
                    }
                    else index++;
                }
            }
        }
        return uniqueCityList;
    }

    private static void splitByCurrency(List<Order> list){
        List<Order> usdList = new ArrayList<>();
        List<Order> uahList = new ArrayList<>();
        for (Order order : list){
            if(order.getCurrency() == Currency.USD) usdList.add(order);
            if(order.getCurrency() == Currency.UAH) uahList.add(order);
        }
    }
    private static void delLessPrices(List<Order> list) {
        List<Order> lessPrices = new ArrayList<>();
        for (Order order : list) {
            if (order.getPrice() < 1500) lessPrices.add(order);
        }
        for (Order lessPrice : lessPrices) {
            list.remove(lessPrice);
        }
    }


    private static void delDuplicates(List<Order> list){
        Set<Order> newList = new HashSet<>(list);
        list.clear();
        list.addAll(newList);
    }
}
