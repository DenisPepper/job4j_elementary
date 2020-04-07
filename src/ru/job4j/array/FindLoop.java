package ru.job4j.array;

public class FindLoop {

    public int indexOf(int[] data, int el) {
        int answer = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                answer = index;
                break;
            }
        }
        return answer;
    }
}
