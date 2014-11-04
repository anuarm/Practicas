package model;

class Currency {
    
    private String name;
    private String symbol;
    private double code;

    public Currency(String name, String symbol, double code) {
        this.name = name;
        this.symbol = symbol;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getCode() {
        return code;
    }
}
