package utils;

public class CurrencyConverter {

    public static double currency;
    public static double totalCurrency;
    public static double amount;

    public static double dollarCurrency(){
        return totalCurrency * currency;
    }

    public static double amountCurrency(){
         amount = dollarCurrency() * 0.06;
         return  amount + dollarCurrency();
    }


}
