package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int  rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euros = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euros + " euros.");
        int dollars = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + Math.round(dollars) + " dollars.");

    }
}
