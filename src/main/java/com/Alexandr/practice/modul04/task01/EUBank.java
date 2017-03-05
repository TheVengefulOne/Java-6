package main.java.com.Alexandr.practice.modul04.task01;


/**
 * Created by admin on 24.02.2017.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    public static final int LIMIT_OF_WITHDRAWAL_USD = 2000;
    public static final int LIMIT_OF_WITHDRAWL_EUR = 2200;
    public static final int LIMIT_OF_REFILL_EUR = 20000;
    public static final int LIMIT_OF_REFILL_USD = 10000;
    public static final int MONTHLY_RATE_USD = 0;
    public static final int MONTHLY_RATE_EUR = 1;
    public static final int COMMISSION_USD_1 = 5;
    public static final int COMMISSION_USD_2 = 7;
    public static final int COMMISSION_EUR_1 = 2;
    public static final int COMMISSION_EUR_2 = 4;
    public static final int MONEY_LIMIT = 1000;





   public int getLimitOfWithdrawal() {
        if(this.getCurrency() == Currency.USD) return LIMIT_OF_WITHDRAWAL_USD;
        else return LIMIT_OF_WITHDRAWL_EUR;
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
            if (amount < MONEY_LIMIT) return COMMISSION_USD_1;
            else return COMMISSION_USD_2;
        } else {
            if (amount < MONEY_LIMIT) return COMMISSION_EUR_1;
            else return COMMISSION_EUR_2;
        }
    }
}
