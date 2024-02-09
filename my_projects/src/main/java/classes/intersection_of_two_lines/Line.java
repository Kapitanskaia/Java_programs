package classes.intersection_of_two_lines;

/**
 * <b>Description</b>
 * <br>Lines are defined by linear equations: y = k * x + b.
 * Line constructor takes k and b coefficients as parameters.
 */
public class Line {
    public int y;
    public int x;
    public int k;
    public int b;
    public Line(int k, int b) {
        // y = k * x + b;
        this.k = k;
        this.b = b;
        this.y = k * this.x + b;
    }

    /**
     * This method returns a Point of intersection of two lines.
     */
    public Point intersection(Line other) {
        // k1 * x + b1 = k2 * x + b2;
        if (k == other.k) {
            return null;
        }
        int px = (other.b - b) / (k - other.k);
        int py = k * px + b;
        return new Point(px, py);
    }

}