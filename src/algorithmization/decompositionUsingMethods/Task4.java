package algorithmization.decompositionUsingMethods;

public class Task4 { // На плоскости заданы своими координатами n точек.
    // Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
    private static double compareResult = 0;
    private static int secondPosition;
    private static int firstPosition;

    public static void main(String[] args) {

        Point[] array = Point.createAndShowArray(10);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length && j != i; j++) {
                if (compareResult < Point.compareDistance(array[i], array[j]))
                    compareResult = Point.compareDistance(array[i], array[j]);
                firstPosition = i;
                secondPosition = j;
            }
        }
        System.out.println("Самое большое расстояние между точками №" + firstPosition + " и №" + secondPosition);
    }
}

class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double compareDistance(Point p1, Point p2) {
        double d = Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y * p1.y));
        return d;
    }

    @Override
    public String toString() {
        return "point: x- " + x + "\ty- " + y;
    }

    public static Point[] createAndShowArray(int n) {
        Point[] points = new Point[n];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(Math.random() * 10, Math.random() * 10);
            System.out.println(points[i]);
        }
        return points;
    }
}
