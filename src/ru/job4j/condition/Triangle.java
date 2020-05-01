package ru.job4j.condition;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.a = firstPoint;
        this.b = secondPoint;
        this.c = thirdPoint;
    }

    public double area() {
        double answer = -1;
        double ab = a.distanceTo(b);
        double ac = a.distanceTo(c);
        double bc = b.distanceTo(c);
        if (exist(ab, ac, bc)) {
            double p = (ab + ac + bc) / 2;
            answer = sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return answer;
    }


    /**
    Нужно проверить, что ab + ac > bc и ac + bc > ab и ab + bc > ac - в этом случае треугольник существует.
     */
    public static boolean exist(double ab, double ac, double bc) {
       return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}
