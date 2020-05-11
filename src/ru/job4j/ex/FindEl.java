package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rsl = -1;
        int index = 0;
        for (String value:values) {
            if (value.equals(key)) {
                rsl = index;
                break;
            }
            index++;
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
