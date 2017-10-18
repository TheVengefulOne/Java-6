package main.java.com.Alexandr.practice.modul10.homework.task5;

/**
 * Created by admin on 18.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            exceptions(3);
        } catch (FirstException | SecondException | ThirdException e) {
            System.out.println(e);
        }
    }

    private static void exceptions(int i) throws FirstException, SecondException, ThirdException {
        switch (i) {
            case 1:
                throw new FirstException("first");
            case 2:
                throw new SecondException("second");
            case 3:
                throw new ThirdException("third");
        }
    }
}
