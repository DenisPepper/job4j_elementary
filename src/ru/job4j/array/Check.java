package ru.job4j.array;

import com.sun.jdi.event.BreakpointEvent;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if (data[index] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

