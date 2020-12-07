package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int ruble = 140;
        int euro = Converter.rubleToEuro(ruble);
        int dollar = Converter.rubleToDollar(ruble);
        System.out.println(ruble + " rubles are " + euro + " euro.");
        System.out.println(ruble + " rubles are " + dollar + " dollar.");
    }
}
