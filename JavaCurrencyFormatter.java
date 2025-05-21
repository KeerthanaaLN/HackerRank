import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usCurrency = usFormat.format(amount);
        System.out.println("US: " + usCurrency);
        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String indianCurrency = indiaFormat.format(amount);
        System.out.println("India: " + indianCurrency);

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chineseCurrency = chinaFormat.format(amount);
        System.out.println("China: " + chineseCurrency);

        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String frenchCurrency = franceFormat.format(amount);
        System.out.println("France: " + frenchCurrency);
    }
}
