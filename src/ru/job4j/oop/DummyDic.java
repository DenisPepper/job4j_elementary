package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово: " + eng + ".";
    }

    public static void main(String[] args) {
        DummyDic translate = new DummyDic();
        System.out.println(translate.engToRus("London"));
        System.out.println(translate.engToRus("Paris"));
        System.out.println(translate.engToRus("New York"));
    }
}

