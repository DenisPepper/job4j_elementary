package ru.job4j.oop;

public class Student {

    public void music(int count) {
        while (count > 0) {
            System.out.println("Tra tra tra");
            count--;
        }
    }

    public void song(int count) {
        while (count > 0) {
            System.out.println("I believe I can fly");
            count--;
        }
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music(3);
        petya.song(3);
    }
}
