package basics.cycles;

public class Task_3 { // Найти сумму квадратов первых ста чисел.
    public static void main(String[] args) {

        long sum = 0;
        int runDigit = 1;
        int finalDigit = 100;
        for (; runDigit <= finalDigit; runDigit++) {
            sum += runDigit * runDigit;
        }
        System.out.println("Сумма квадратов первых ста чисел: " + sum);
    }
}
