package application;

import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ConverterMoney {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.printf("What is the dollar price? ");
        CurrencyConverter.currency= scan.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.totalCurrency = scan.nextDouble();

        System.out.printf("Price dollar: %.2f%n"
                +"Total dollars bougth: %.2f%n"
                +"Amount to be paid in reais = R$ %.2f",CurrencyConverter.currency,
                CurrencyConverter.totalCurrency, CurrencyConverter.amountCurrency());

        scan.close();
    }
}
