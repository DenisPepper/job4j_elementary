package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        String name = "Name ";
        for (byte index = 0; index < names.length; index++) {
            names[index] = name + index;
            System.out.println(names[index]);
        }
    }
}
