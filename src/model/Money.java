package model;

public class Money {
    
    private double money;
    private Currency currency;

    public double getMoney() {
        return money;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Money(double money, Currency currency) {
        this.money = money;
        this.currency = currency;
    }
    
}


