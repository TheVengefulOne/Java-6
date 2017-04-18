package main.java.com.Alexandr.practice.modul06.taskk01;

/**
 * Created by admin on 23.03.2017.
 */
public class ArraysMain {
    public static void main(String[] args) {
        User[] users = new User[4];
        users[0] = new User(1111111, "Dima", "Konyhov", 3500, 100);
        users[1] = new User(2222222, "Vasya", "Petrov", 4200, 900);
        users[2] = new User(3333333, "German", "Litvin", 1200, 95);
        users[3] = new User(4444444, "Kolya", "Sidr", 3445, 1290);


        for (User user : UserUtils.uniqueUsers(users)) {
            System.out.println(user.getFirstName());
        }
        for (User user : UserUtils.usersWithContitionalBalance(users, 7000)) {
            System.out.println(user.getFirstName());

        }
    }
}
