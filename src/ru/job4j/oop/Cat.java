package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void setFood(String eat) {
        this.food = eat;
    }

    public void setNickname(String nickname) {
        this.name = nickname;
    }

    public void showSettings() {
        System.out.println("Кот по кличке '" + this.name + "' съел " + this.food);
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.setNickname("Котенок Гав");
        gav.setFood("котлета");
        gav.showSettings();

        Cat black = new Cat();
        black.setNickname("Черный кот");
        black.setFood("рыба");
        black.showSettings();
    }


}
