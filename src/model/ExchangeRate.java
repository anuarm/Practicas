package model;

import java.util.Date;

public class ExchangeRate {
    
    public Currency in;
    private Currency out;
    private double value;

    public Currency getIn() {
        return in;
    }

    public Currency getOut() {
        return out;
    }

    public double getValue() {
        return value;
    }

    public ExchangeRate(Currency in, Currency out, double value) {
        this.in = in;
        this.out = out;
        this.value = value;
    }
}
