package ru.job4j.array;

public class Defragment {

    public static String[] swap(String[] array, int source, int dest) {
        String remove = array[source];
        array[source] = array[dest];
        array[dest] = remove;
        return array;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (index < array.length) {
                        String string = array[index];
                        if (string != null) {
                            swap(array, point, index);
                            break;
                        }
                    index++;
                    }
                index = point;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            for (int index = 0; index < input.length; index++) {
            System.out.print(input[index] + " ");
            }
        System.out.println();
        String[] compressed = compress(input);
    }
}