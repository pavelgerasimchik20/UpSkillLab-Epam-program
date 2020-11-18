package algorithmization.sorting;

import java.util.Arrays;

public class TestSorting extends Sorting { // Все задачи по сортингу будут здесь по соседству

    public static void main(String[] args) {

        k = 3;
        int[] array1 = new int[]{10, 9, 11, 15, 43, 73, 3, 8, 12, 72, 124, 222, 0, 0, 6, 0, 65, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = new int[]{1, 0, 1, 0, 1};
        int[] newArray = concatenateArrays(array1, array2);
        shellSort(newArray);      //    <------ choose sort here
        System.out.println("Sorted array - > " + Arrays.toString(newArray));
    }
}

class Sorting {
    protected static int k;

    protected static int[] concatenateArrays(int[] array1, int[] array2) {
        int j = 0;
        array1 = Arrays.copyOf(array1, array1.length + array2.length);
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (i <= k) {
                array3[i] = array1[i];
            } else if (i <= k + array2.length) {
                array3[i] = array2[j];
                j++;
            } else {
                array3[i] = array1[i - array2.length];
            }
        }
        System.out.println("United array - > " + Arrays.toString(array3));
        return array3;
    }

    protected static void selectedSort(int[] arr) {
        for (int min = 0; min < arr.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            arr[min] = arr[min] + arr[least];
            arr[least] = arr[min] - arr[least];
            arr[min] = arr[min] - arr[least];
        }

    }

    protected static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
    }

    protected static void bubbleReverseSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    protected static void shellSort(int[] array) {

        int increment = array.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertSort(array, startIndex, increment);
            }
            increment = increment / 2;
        }
    }

    private static void insertSort(int[] array, int startIndex, int increment) {
        for (int i = startIndex; i < array.length - 1; i = i + increment) {
            for (int j = Math.min(i + increment, array.length - 1); j - increment >= 0; j = j - increment) {
                if (array[j - increment] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[j - increment];
                    array[j - increment] = tmp;
                } else {
                    break;
                }
            }
        }
    }
}

