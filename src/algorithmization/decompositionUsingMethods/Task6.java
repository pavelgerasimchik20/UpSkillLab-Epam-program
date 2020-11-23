package algorithmization.decompositionUsingMethods;

public class Task6 extends Task2 { // Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    public static void main(String[] args) {

        int a = 25;
        int b = 5;
        int c = 15;

        if(findNOD(a,b)==1 || findNOD(b,c)==1 || findNOD(a,c)==1){
            System.out.println("числа взаимно простые )) ");
        }else {
            System.out.println("числа не взаимно простые ((");
        }
    }
}
