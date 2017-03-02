package main.java.com.Alexandr.practice.modul04.task01;


/**
 * Created by admin on 24.02.2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency , numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }




    @Override
    int getLimitOfWithdrawal() {
        if(this.getCurrency()== Currency.USD) return 1000;
       else return 1200;

    }

    @Override
    int getLimitOfFunding() {
        if(this.getCurrency()==Currency.EUR) return 10000;
        else return 0;
    }

    @Override
    int getMonthlyRate() {
        if(this.getCurrency()==Currency.EUR) return 2;
        else return 1;
    }

    @Override
    int getCommission(int summ) {
        if (this.getCurrency()==Currency.USD){
            if (summ<1000) return 5;
            else return 7;
        }
        else {
            if (summ<1000) return 6;
            else return 8;
        }
    }
}
