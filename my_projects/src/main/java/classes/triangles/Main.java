package classes.triangles;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        {
            System.out.println("Enter the coordinates (x,y) of the triangle vertices in the column:");
            double ax = scan.nextInt();
            double ay = scan.nextInt();
            double bx = scan.nextInt();
            double by = scan.nextInt();
            double cx = scan.nextInt();
            double cy = scan.nextInt();

            double area = new Triangle(new Point(ax, ay), new Point(bx, by), new Point(cx, cy)).area();
            System.out.println("Triangle's area: " + area);
        }
        {
            System.out.println("Enter the coordinates (x,y) of the triangle vertices in the column:");
            double ax = scan.nextInt();
            double ay = scan.nextInt();
            double bx = scan.nextInt();
            double by = scan.nextInt();
            double cx = scan.nextInt();
            double cy = scan.nextInt();

            Point centroid = new Triangle(new Point(ax, ay), new Point(bx, by), new Point(cx, cy)).centroid();

            System.out.print("Centroid [" + centroid.getX() + ", ");
            System.out.println(centroid.getY() + "]");
        }
    }
}
