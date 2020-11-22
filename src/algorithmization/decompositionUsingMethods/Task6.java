package algorithmization.decompositionUsingMethods;

public class Task6 extends Task2 { // Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    public static void main(String[] args) {

        int a = 25;
        int b = 26;
        int c = 27;

        if(findNOD(a,b)==1 && findNOD(b,c)==1 && findNOD(a,c)==1){
            System.out.println("these numbers are взаимно простые )) ");
        }else {
            System.out.println("these numbers aren`t взаимно простые ((");
        }
    }
}
