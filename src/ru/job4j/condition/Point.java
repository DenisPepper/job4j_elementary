package ru.job4j.condition;
import java.util.Scanner;


public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {

       double step1 = x2 - x1;
       double step2 = y2 - y1;
       double step3 = Math.pow(step1, 2);
       double step4 = Math.pow(step2, 2);
       double step5 = step3 + step4;
       return Math.sqrt(step5);
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int x1, y1, x2, y2;
        System.out.println("input point x1 and press enter");
        x1 = userInput.nextInt();
        System.out.println("input point y1 and press enter");
        y1 = userInput.nextInt();
        System.out.println("input point x2 and press enter");
        x2 = userInput.nextInt();
        System.out.println("input point y2 and press enter");
        y2 = userInput.nextInt();
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result: " + result);
    }
}