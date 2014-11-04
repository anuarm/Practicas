package persistence;

import model.CurrencySet;

public class CurrencySetLoader {
    
   private CurrencySet currencySet;

    public CurrencySetLoader(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }
    
    public CurrencySet getCurrencySet() {
        return currencySet;
    }

}
