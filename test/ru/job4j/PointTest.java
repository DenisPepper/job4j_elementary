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

    @Test
    public void distance3d() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 2, 2);
        double expected = 1.73;
        double out = a.distanceTo3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
