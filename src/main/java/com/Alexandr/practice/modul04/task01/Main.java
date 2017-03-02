package main.java.com.Alexandr.practice.modul04.task01;

import main.java.com.Alexandr.practice.modul04.task01.Currency;
import main.java.com.Alexandr.practice.modul04.task01.ChinaBank;
import main.java.com.Alexandr.practice.modul04.task01.EUBank;
import main.java.com.Alexandr.practice.modul04.task01.USBank;

import main.java.com.Alexandr.practice.modul04.task01.User;
import main.java.com.Alexandr.practice.modul04.task01.BankSystemImp;


/**
 * Created by admin on 25.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        BankSystemImp bankSystemImp = new BankSystemImp();

        USBank usBank1 = new USBank(1,"Usa",Currency.USD,3, 110,1,1000000 );
        EUBank euBank1 = new EUBank(1,"Europe" , Currency.EUR,3,100,1,10000000);
        ChinaBank chinaBank1 = new ChinaBank(1,"China", Currency.USD,1000,1,1,10000000);
        User userUSBank1 = new User(1,"name1",200,3,"CN_N1",100,usBank1);
        User userUSBank2 = new User(1,"name2",200,3,"CN_N2",100,usBank1);
        User userEUBank1 = new User(1,"name1",200,3,"CN_N3",100,euBank1);
        User userEUBank2 = new User(1,"name2",200,3,"CN_N4",100,euBank1);
        User userChinaBank1 = new User(1,"name1",200,3,"CN_N5",100,chinaBank1);
        User userChinaBank2 = new User(1,"name2",200,3,"CN_N6",100,chinaBank1);
        System.out.println("User1 name is "+ userUSBank1.getName());
        System.out.println("John`s bank is in the "+userUSBank2.getBank().getBankCountry());
        System.out.println("Bob`s company is "+userEUBank1.getCompanyName());

        bankSystemImp.withdrawOfUser(userEUBank2, 999999);
        bankSystemImp.fundUser(userChinaBank1, 500);
        bankSystemImp.paySalary(userChinaBank2);
        bankSystemImp.transferMoney(userEUBank1,userEUBank2,99999);

        System.out.println(userUSBank1.toString());
    }

}
