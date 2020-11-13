package algorithmization.onedimensional;

import java.util.Arrays;

public class Task10 { //  Дан целочисленный массив с количеством элементов п.
    // Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями)

    public static void main(String[] args) {

        long[] array = new long[]{134L, -21421412214124L, 524214, 124214125, 123L, -99643L, 64937L, 3257237L, 12412125L, -1L};
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i+=2){
            array[i]=0;
        }
        System.out.println(Arrays.toString(array));
    }
}
