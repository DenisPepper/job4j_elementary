package ru.job4j.array;

public class BarleyBreak {

    public static void main(String[] args) {
        int[][] table = new int[3][3];
        byte loopNumber = 0;
        for (byte i = 0; i < 3; i++) {
            for (byte j = 0; j < 3; j++) {
                loopNumber++;
                table[i][j] = loopNumber;
            }
        }
    }
}
