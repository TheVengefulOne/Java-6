package main.java.com.Alexandr.practice.modul04.task01;


/**
 * Created by admin on 24.02.2017.
 */
public  class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    int limitOfWithdrawalUSD = 100;
    int limitOfWithdrawalEUR = 150;
    int limitOfRefillEUR = 5000;
    int limitOfRefillUSD = 5000;
    int monthlyRateUSD = 1;
    int monthlyRateEUR = 0;
    int commissionUSD1 = 3;
    int commissionUSD2 = 5;
    int commissionEUR1 = 10;
    int commissionEUR2 = 11;





   public int  getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) return limitOfWithdrawalUSD;
        else return limitOfWithdrawalEUR;
    }


    public int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) return limitOfRefillEUR;
        else return limitOfRefillUSD;
    }


    public int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD) return monthlyRateUSD;
        else return monthlyRateEUR;
    }


    public int getCommission(int amount) {
        if (this.getCurrency() == Currency.USD) {
            if (amount < 1000) return commissionUSD1;
            else return commissionUSD2;
        } else {
            if (amount < 1000) return commissionEUR1;
            else return commissionEUR2;
        }
    }
}
