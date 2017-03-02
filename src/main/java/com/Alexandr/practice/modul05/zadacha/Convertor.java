package main.java.com.Alexandr.practice.modul05.zadacha;

import java.math.BigDecimal;

/**
 * Created by admin on 23.02.2017.
 */
public class Convertor {
   double rate;


    public Convertor(double rate) {
        this.rate = rate;
    }

    public double convert(double amountCurrency ){
        double usd = amountCurrency / rate;
       BigDecimal bigDecimal= new BigDecimal(usd).setScale(2 , BigDecimal.ROUND_HALF_DOWN);
        usd = bigDecimal.doubleValue();
        return usd;

    }

}
