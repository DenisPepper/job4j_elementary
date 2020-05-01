package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distanceTo(Point point) {
        return sqrt(pow(point.x - this.x, 2) + pow(point.y - this.y, 2));
    }

    public double distanceTo3d(Point point) {
        return sqrt(pow(point.x - this.x, 2) + pow(point.y - this.y, 2) + pow(point.z - this.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distanceTo(b);
        System.out.println(dist);
    }
}