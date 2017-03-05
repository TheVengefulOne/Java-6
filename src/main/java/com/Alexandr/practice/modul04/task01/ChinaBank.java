package main.java.com.Alexandr.practice.modul04.task01;


/**
 * Created by admin on 24.02.2017.
 */
public  class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    public static final int LIMIT_OF_WITHDRAWAL_USD = 100;
    public static final int LIMIT_OF_WITHDRAWAL_EUR = 150;
    public static final int LIMIT_OF_REFILL_EUR = 5000;
    public static final int LIMIT_OF_REFILL_USD = 5000;
    public static final int MONTHLY_RATE_USD = 1;
    public static final int MONTHLY_RATE_EUR = 0;
    public static final int COMMISSION_USD_1 = 3;
    public static final int COMMISSION_USD_2 = 5;
    public static final int COMMISSION_EUR_1 = 10;
    public static final int COMMISSION_EUR_2 = 11;





   public int  getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) return LIMIT_OF_WITHDRAWAL_USD;
        else return LIMIT_OF_WITHDRAWAL_EUR;
    }


    public int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) return LIMIT_OF_REFILL_EUR;
        else return LIMIT_OF_REFILL_USD;
    }


    public int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD) return MONTHLY_RATE_USD;
        else return MONTHLY_RATE_EUR;
    }


    public int getCommission(int amount) {
        if (this.getCurrency() == Currency.USD) {
            if (amount < 1000) return COMMISSION_USD_1;
            else return COMMISSION_USD_2;
        } else {
            if (amount < 1000) return COMMISSION_EUR_1;
            else return COMMISSION_EUR_2;
        }
    }
}
