package classes;
/**
 * <b>Description</b>
 * <br>Returns a two-dimensional array coming in the form of a table
 * and containing numbers from 1 up to (<i>rows * columns</i>).
 * The size of the table will be specified by the given parameters.
 * Numbers fill the "table" clockwise from the top-level corner in a spiral manner.
 */
public class Spiral {

    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(5, 6);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.printf("%4s", spiral[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] spiral(int rows, int columns) {
        int[][] spiral = new int[rows][columns];
        // spiral[y][x], y - row's index, x - column's index
        if (rows == 0 || columns == 0) return null;
        int val = 1;
        int y = 0;
        int x = 0;
        int xLeftLimit = 0;
        int xRightLimit = columns - 1;
        int yLeftLimit = 1;
        int yRightLimit = rows - 1;
        while (val < rows * columns) {
            while (x < xRightLimit) {
                spiral[y][x] = val;
                val++;
                x++;
            }
            xRightLimit--;
            while (y < yRightLimit) {
                spiral[y][x] = val;
                val++;
                y++;
            }
            yRightLimit--;
            while (x > xLeftLimit) {
                spiral[y][x] = val;
                val++;
                x--;
            }
            xLeftLimit++;
            while (y > yLeftLimit) {
                spiral[y][x] = val;
                val++;
                y--;
            }
            yLeftLimit++;

        }
        if (spiral[y][x] == 0) {
            spiral[y][x] = val;
        }
        return spiral;
    }
}