package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array.length % 2 == 0 && index == array.length / 2) {
                break;
            }
            if (array.length % 2 != 0 && index == (array.length - 1) / 2) {
                break;
            }
            int remove = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = remove;
        }
        return array;
    }
}
