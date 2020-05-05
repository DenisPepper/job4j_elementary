package ru.job4j.oop.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 11;
        String[] players = {"Player 1", "Player 2"};
        int index;
        boolean nextPlayer = false;

        System.out.println("Начало игры.");
        while (sum > 0) {
            index = nextPlayer ? 1 : 0;
            nextPlayer = !(nextPlayer);
            int userAction = 0;
            while (userAction != 1 && userAction != 2 && userAction != 3 || userAction > sum) {
                System.out.print(players[index] + " введите количество спичек (от 1 до 3): ");
                userAction = Integer.valueOf(input.nextLine());
            }
            sum = sum - userAction;
            System.out.println("В игре осталось " + sum + " шт.");
        }
        System.out.println("Игра окончена!");
    }
}
