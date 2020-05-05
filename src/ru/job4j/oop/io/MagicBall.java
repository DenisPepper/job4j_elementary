package ru.job4j.oop.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        System.out.print("Добро пожаловать. Что ты хочешь узнать? ");

        Scanner input = new Scanner(System.in);
        String question = input.nextLine();

        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Yes");
        } else if (answer == 1) {
            System.out.println("No");
        } else {
            System.out.println("Maybe");
        }
    }
}
