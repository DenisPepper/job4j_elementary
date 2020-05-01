package ru.job4j.oop;

public class Cat {
    public static void main(String[] args) {
        Cat peppy = new Cat();
        System.out.println("Peppy says: "  + peppy.sound());

        Cat sparky = new Cat();
    }

    public String sound() {
        return "meow - meow";
    }
}
