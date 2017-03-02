package main.java.com.Alexandr.practice.modul04.task01;


/**
 * Created by admin on 24.02.2017.
 */
public  class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }



    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) return 100;
        else return 150;
    }

    @Override
    int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) return 5000;
        else return 10000;
    }

    @Override
    int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD) return 1;
        else return 0;
    }

    @Override
    int getCommission(int amount) {
        if (this.getCurrency() == Currency.USD) {
            if (amount < 1000) return 3;
            else return 5;
        } else {
            if (amount < 1000) return 1;
            else return 11;
        }
    }
}
