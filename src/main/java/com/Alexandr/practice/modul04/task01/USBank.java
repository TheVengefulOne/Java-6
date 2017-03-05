package main.java.com.Alexandr.practice.modul04.task01;


/**
 * Created by admin on 24.02.2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency , numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    public static final int LIMIT_OF_WITHDRAWAL_USD = 1000;
    public static final int LIMIT_OF_WITHDRAWAL_EUR = 1200;
    public static final int LIMIT_OF_REFILL_EUR = 10000;
    public static final int LIMIT_OF_REFILL_USD = 0;
    public static final int MONTHLY_RATE_USD = 2;
    public static final int MONTHLY_RATE_EUR = 1;
    public static final int COMMISSION_USD_FIVE_PERCENT = 5;
    public static final int COMMISSION_USD_SEVEN_PERCENT = 7;
    public static final int COMMISSION_EUR_SIX_PERCENT = 6;
    public static final int COMMISSION_EUR_EIGHT_PERCENT = 8;
    public static final int MONEY_LIMIT = 1000;





    public int getLimitOfWithdrawal() {
        if(this.getCurrency() == Currency.USD) return LIMIT_OF_WITHDRAWAL_USD;
       else return LIMIT_OF_WITHDRAWAL_EUR;

    }


    public int getLimitOfFunding() {
        if(this.getCurrency() == Currency.EUR) return LIMIT_OF_REFILL_EUR;
        else return LIMIT_OF_REFILL_USD;
    }


    public int getMonthlyRate() {
        if(this.getCurrency() == Currency.EUR) return MONTHLY_RATE_EUR;
        else return MONTHLY_RATE_USD;
    }


    public int getCommission(int summ) {
        if (this.getCurrency() == Currency.USD){
            if (summ < MONEY_LIMIT) return COMMISSION_USD_FIVE_PERCENT;
            else return COMMISSION_USD_SEVEN_PERCENT;
        }
        else {
            if (summ < MONEY_LIMIT) return COMMISSION_EUR_SIX_PERCENT;
            else return COMMISSION_EUR_EIGHT_PERCENT;
        }
    }
}
