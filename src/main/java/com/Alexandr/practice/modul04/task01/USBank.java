package main.java.com.Alexandr.practice.modul04.task01;


/**
 * Created by admin on 24.02.2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency , numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    int limitOfWithdrawalUSD = 1000;
    int limitOfWithdrawalEUR = 1200;
    int limitOfRefillEUR = 10000;
    int limitOfRefillUSD = 0;
    int monthlyRateUSD = 2;
    int monthlyRateEUR = 1;
    int commissionUSD1 = 5;
    int commissionUSD2 = 7;
    int commissionEUR1 = 6;
    int commissionEUR2 = 8;





    public int getLimitOfWithdrawal() {
        if(this.getCurrency() == Currency.USD) return limitOfWithdrawalUSD;
       else return limitOfWithdrawalEUR;

    }


    public int getLimitOfFunding() {
        if(this.getCurrency() == Currency.EUR) return limitOfRefillEUR;
        else return limitOfRefillUSD;
    }


    public int getMonthlyRate() {
        if(this.getCurrency() == Currency.EUR) return monthlyRateEUR;
        else return monthlyRateUSD;
    }


    public int getCommission(int summ) {
        if (this.getCurrency() == Currency.USD){
            if (summ < 1000) return commissionUSD1;
            else return commissionUSD2;
        }
        else {
            if (summ < 1000) return commissionEUR1;
            else return commissionEUR2;
        }
    }
}
