package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distanceTo(Point b) {
        return sqrt(pow(b.x - this.x, 2) + pow(b.y - this.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distanceTo(b);
        System.out.println(dist);
    }
}