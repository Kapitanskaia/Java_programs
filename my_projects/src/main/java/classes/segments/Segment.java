package classes.segments;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {
    public Point start;
    public Point end;

    public Segment(Point start, Point end) {
        if (start.getX() == end.getX() && start.getY() == end.getY()) {
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.end = end;
    }

    double length() {
        // d = sqrt ( (x1 - x0)^2 + (y1 - y0)^2 )
        double x2 = pow(end.getX() - start.getX(), 2);
        double y2 = pow(end.getY() - start.getY(), 2);
        return sqrt(x2 + y2);
    }

    Point middle() {
        double mx = (start.getX() + end.getX()) / 2;
        double my = (start.getY() + end.getY()) / 2;
        return new Point(mx, my);
    }

    Point intersection(Segment another) {
        double x1 = start.getX();
        double y1 = start.getY();
        double x2 = end.getX();
        double y2 = end.getY();
        double x3 = another.start.getX();
        double y3 = another.start.getY();
        double x4 = another.end.getX();
        double y4 = another.end.getY();

        double divider = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (divider == 0) {
            return null;
        }

        double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / divider;
        double u = ((x1 - x3) * (y1 - y2) - (y1 - y3) * (x1 - x2)) / divider;
        double ix = x1 + t * (x2 - x1);
        double iy = y1 + t * (y2 - y1);

        if (t < 0 || t > 1 || u < 0 || u > 1) {
            return null;
        }

        return new Point(ix, iy);
    }
}