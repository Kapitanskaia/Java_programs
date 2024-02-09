package classes.triangles;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class Triangle {
    public Point a, b, c;
    public double ab, bc, ca;

    /**
     * This is a constructor, which has three points as parameters.
     * Makes sure that these points refer to vertices of the triangle.
     * Ensures that the created triangle exists and it is not degenerative.
     * @param a
     * @param b
     * @param c
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        ab = sideLength(a, b);
        bc = sideLength(b, c);
        ca = sideLength(c, a);
        if (ab + bc <= ca || bc + ca <= ab || ca + ab <= bc) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * @param start
     * @param end
     * @return the side length of the triangle
     */
    public double sideLength(Point start, Point end) {
        double x2 = pow(end.getX() - start.getX(), 2);
        double y2 = pow(end.getY() - start.getY(), 2);
        return sqrt(x2 + y2);
    }

    /**
     * @return the perimeter of the triangle
     */
    public double perimeter() {
        return (ab + bc + ca);
    }

    /**
     * @return the area of the triangle
     */
    public double area() {
        double p = perimeter()/2;
        return sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    /**
     * @return the centroid of the triangle
     */
    public Point centroid(){
        double cx = (a.getX() + b.getX() + c.getX()) / 3;
        double cy = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(cx, cy);
    }
}
