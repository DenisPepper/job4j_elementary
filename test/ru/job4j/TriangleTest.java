package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenDoesNotExist() {
        boolean result = Triangle.exist(2.0, 3.0, 5.0);
        assertThat(result, is(false));
    }
    @Test
    public void areaWhenExist() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        Point c = new Point(1, 2);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 0.5;
        Assert.assertEquals(expected, result, 0.01);
    }
}


