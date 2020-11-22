package algorithmization.decompositionUsingMethods;

public class Task9 { //  Даны числа X, Y, Z, Т — длины сторон четырехугольника.
    // Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
    private static final int X = 10;
    private static final int Y = 5;
    private static final int Z = 10;
    private static final int T = 5;

    public static void main(String[] args) {

        System.out.println(getSquare(X,Y,Z,T));

    }

    public static double getSquare(int a, int b, int c, int d){
        int p= (a+b+c+d)/2;
        return Math.sqrt((p-a)*(p-b)*(p-c)*(p-d));
    }
}
