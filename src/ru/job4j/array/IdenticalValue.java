package ru.job4j.array;

public class IdenticalValue {

    public static void main(String[] args) {
        int[] firstArray = {1, 2};
        int[] secondArray = {3, 1};

        for (int elementOne:firstArray) {
            for (int elementTwo:secondArray) {
                if (elementOne == elementTwo) {
                    System.out.println("the same elements: " + elementOne);
                    break;
                }
            }
        }
    }
}
