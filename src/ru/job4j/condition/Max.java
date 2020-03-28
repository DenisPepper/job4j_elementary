package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {

        int spread = first - second;
        return spread >= 0 ? first : second;
    }
}
