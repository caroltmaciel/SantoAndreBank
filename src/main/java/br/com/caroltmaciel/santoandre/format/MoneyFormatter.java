package br.com.caroltmaciel.santoandre.format;

import br.com.caroltmaciel.santoandre.commons.LocaleUtil;

import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormatter {

    private final Locale locale;

    public MoneyFormatter() {
        this.locale = LocaleUtil.getPortugueseBrazil();
    }

    public MoneyFormatter(Locale locale) {
        this.locale = locale;
    }

    public String formatCurrency(Double money) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(this.locale);
        return currencyFormatter.format(money);
    }

}