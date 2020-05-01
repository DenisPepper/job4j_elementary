package ru.job4j;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance() {
      Point a = new Point(1, 2);
      Point b = new Point(3, 4);
      double expected = 2.83;
      double out = a.distanceTo(b);
      Assert.assertEquals(expected, out, 0.01);
    }
}
