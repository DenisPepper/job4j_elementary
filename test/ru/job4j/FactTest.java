package ru.job4j;

import org.junit.Test;
import ru.job4j.ex.Fact;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenException() {
        int rsl = Fact.calc(-1);
    }

}
