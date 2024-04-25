import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Ships
 */
public class Ships {

    public static void main(String[] args) {

        System.out.println("Enter the name of the ship data file:");
        try {
            Scanner sc = new Scanner(System.in);
            String fileName = sc.nextLine();
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            int count = 0;

            while (fileReader.hasNextLine()) {
                ++count;
                StringTokenizer st = new StringTokenizer(fileReader.nextLine());
                double a_1 = Double.parseDouble(st.nextToken());
                double b_1 = Double.parseDouble(st.nextToken());
                double c_1 = Double.parseDouble(st.nextToken());
                double x_1 = Double.parseDouble(st.nextToken());
                double y_1 = Double.parseDouble(st.nextToken());
                Point ship_1 = new Point(x_1, y_1);
                st = new StringTokenizer(fileReader.nextLine());
                double a_2 = Double.parseDouble(st.nextToken());
                double b_2 = Double.parseDouble(st.nextToken());
                double c_2 = Double.parseDouble(st.nextToken());
                double x_2 = Double.parseDouble(st.nextToken());
                double y_2 = Double.parseDouble(st.nextToken());
                Point ship_2 = new Point(x_2, y_2);
                Point intersection = intersection(a_1, b_1, c_1, a_2, b_2, c_2);
                int shipNumber = 0;
                double ship1Distance = distance(ship_1, intersection);
                double ship2Distance = distance(ship_2, intersection);
                if (ship1Distance - ship2Distance > 0) {
                    shipNumber = 2;
                } else {
                    shipNumber = 1;
                }
                if (Math.abs(ship2Distance - ship1Distance) > 0.5) {
                    System.out.println("Pair " + count + ": " + "Intersection point: " + intersection.toString()
                            + "; Ship S1's distance is " + String.format("%.1f", ship1Distance)
                            + "; Ship S2's distance is " + String.format("%.1f", ship2Distance)
                            + "; Ship S" + shipNumber + " is nearest.");
                } else {
                    System.out.println("Pair " + count + ": " + "Intersection point: " + intersection.toString()
                            + "; Ship S1's distance is " + String.format("%.1f", ship1Distance)
                            + "; Ship S2's distance is " + String.format("%.1f", ship2Distance)
                            + "; Tied.");

                }
            }
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static double distance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
    }

    public static Point intersection(double a_1, double b_1, double c_1, double a_2, double b_2, double c_2) {
        double x_i = ((b_1 * c_2) - (b_2 * c_1)) / ((a_1 * b_2) - (a_2 * b_1));
        double y_i = ((a_2 * c_1) - (a_1 * c_2)) / ((a_1 * b_2) - (a_2 * b_1));
        return new Point(x_i, y_i);
    }

}