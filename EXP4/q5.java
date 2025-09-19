package EXP4;
class Point {
    double x, y;

    Point() {
        x = 0; y = 0;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);
        System.out.printf("Distance: %.2f\n", Point.distance(p1, p2));
    }
}
