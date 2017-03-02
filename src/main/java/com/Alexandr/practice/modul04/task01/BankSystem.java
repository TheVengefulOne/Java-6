package main.java.com.Alexandr.practice.modul04.task01;

import main.java.com.Alexandr.practice.modul04.task01.User;

/**
 * Created by admin on 25.02.2017.
 */
public interface BankSystem {
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);



}
