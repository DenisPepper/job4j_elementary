package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int remove = array[2];
        array[2] = array[1];
        array[1] = remove;
        remove = array[4];
        array[4] = array[3];
        array[3] = remove;
        remove = array[4];
        array[4] = array[0];
        array[0] = remove;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}