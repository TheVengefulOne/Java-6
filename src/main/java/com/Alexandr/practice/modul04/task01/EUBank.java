package main.java.com.Alexandr.practice.modul04.task01;


/**
 * Created by admin on 24.02.2017.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    int limitOfWithdrawalUSD = 2000;
    int limitOfWithdrawalEUR = 2200;
    int limitOfRefillEUR = 20000;
    int limitOfRefillUSD = 10000;
    int monthlyRateUSD = 0;
    int monthlyRateEUR = 1;
    int commissionUSD1 = 5;
    int commissionUSD2 = 7;
    int commissionEUR1 = 2;
    int commissionEUR2 = 4;





   public int getLimitOfWithdrawal() {
        if(this.getCurrency() == Currency.USD) return limitOfWithdrawalUSD;
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
