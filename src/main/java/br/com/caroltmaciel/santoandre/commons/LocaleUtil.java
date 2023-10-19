package br.com.caroltmaciel.santoandre.commons;

import java.util.Locale;

public class LocaleUtil {

    private static final Locale PORTUGUESE_BRAZIL = new Locale("PT", "br");
    private static final Locale ENGLISH_UK = new Locale("EN", "uk");
    private static final Locale SPANISH_SPAIN = new Locale("ES", "es");
    private static final Locale PORTUGUESE_PORTUGAL = new Locale("PT", "pt");

    private LocaleUtil() {
    }

    public static Locale getPortugueseBrazil() {
        return PORTUGUESE_BRAZIL;
    }

    public static Locale getEnglishUk() {
        return ENGLISH_UK;
    }

    public static Locale getSpanishSpain() {
        return SPANISH_SPAIN;
    }

    public static Locale getPortuguesePortugal() {
        return PORTUGUESE_PORTUGAL;
    }
}