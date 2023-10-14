package br.com.caroltmaciel.santoandre.format;

public class MoneyFormatter {
    public String formatEuro(Double money) {
        return String.format("%.2f", money) + "€";
    }
}