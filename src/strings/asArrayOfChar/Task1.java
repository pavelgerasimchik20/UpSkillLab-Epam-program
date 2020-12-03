package strings.asArrayOfChar;

import java.util.Arrays;

public class Task1 {  // Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

    public static void main(String[] args) {

        String [] array = new String[]{"blaBlaBla","redRed","goodBye","weaTher","longLiveBelarus","qwerTy"};
        toSnakeCase(array);

    }

    private static void toSnakeCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replaceAll("([a-z])([A-Z])","$1_$2").toLowerCase();
            System.out.println(array[i]);
        }
    }
}
