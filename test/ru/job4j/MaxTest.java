package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstMoreSecond() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstLessSecond() {
        int result = Max.max(3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstEqualSecond() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenFirstMoreOthers() {
        int result = Max.max(7, 4, 1, 3);
        assertThat(result, is(7));
    }
}