package ru.job4j.calculator;

public class Fit {

    public static float manWeight(float height) {
        return (float) ((height - 100) * 1.15);
    }

    public static float womanWeight(float height) {
        return (float) ((height - 110) * 1.15);
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