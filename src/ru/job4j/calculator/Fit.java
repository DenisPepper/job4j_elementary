package ru.job4j.calculator;

public class Fit {

    public static double  manWeight(double  height) {
        return ((height - 100) * 1.15);
    }

    public static double  womanWeight(double  height) {
        return ((height - 110) * 1.15);
    }

    public static void main(String[] args) {

        int heightMan = 176;
        double man = Fit.manWeight(heightMan);
        System.out.println("Man at " + heightMan + "sm is " + man + " kg");

        int heightWoman = 160;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman at " + heightWoman + "sm is " + woman + " kg");
    }

}