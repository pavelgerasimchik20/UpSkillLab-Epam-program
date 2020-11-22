package algorithmization.decompositionUsingMethods;

public class Task3 { // Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника
    public static void main(String[] args) {

        int side = 10;
        double hexagonSquare = 6 * someTriangle(side);
        System.out.println(hexagonSquare);

    }
    public static double someTriangle(int a){
        double square = a*a*Math.sqrt(3)/4;
        return square;
    }
}
