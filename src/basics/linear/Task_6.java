package basics.linear;

public class Task_6 {

    public static void main(String[] args) {

        Area.Point point = new Area().new Point(-3,-3);
        System.out.println(point.checkPointLayout());
    }
}

class Area {
    private final int MAX_X = 4;
    private final int MIN_X = -4;
    private final int MAX_Y = 4;
    private final int MIN_Y = -3;
    Point point;

    protected class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        protected boolean checkPointLayout() {
            if (x <= MAX_X && x >= MIN_X && y >= MIN_Y && y <= 0) {
                return true;
            } else if (y <= MAX_Y && y >= 0 && x <= MAX_X / 2 && x >= MIN_X / 2) {
                return true;
            } else {
                return false;
            }
        }

    }
}
