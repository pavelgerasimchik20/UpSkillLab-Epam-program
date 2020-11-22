package algorithmization.decompositionUsingMethods;

import java.util.Arrays;

public class Task5 { // Составить программу, которая в массиве A[N] находит второе по величине число
    // (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов)
    public static void main(String[] args) {

        int[] easy = new int[]{-12,12,13,54,15,16,34,-46,34,-56,54};
        System.out.println(Arrays.toString(easy));
        Arrays.sort(easy);
        System.out.println(Arrays.toString(easy));
        for (int i = easy.length-1; i > 0 ; i--) {
            if(easy[i] > easy[i-1]){
                System.out.println(easy[i-1]);
                break;
            }
        }
    }
}
