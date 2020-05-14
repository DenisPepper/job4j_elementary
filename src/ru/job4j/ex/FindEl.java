package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < values.length; index++) {
            if (values[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found.");
        }
        return rsl;
    }

    public static void main(String[] args) {

        String[] numbers = {"1", "2", "3"};
        String number = "4";
        try {
            indexOf(numbers, number);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
