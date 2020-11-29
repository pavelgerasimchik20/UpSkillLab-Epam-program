package strings.asStringBuilder;

public class Task4 { // С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
    public static void main(String[] args) {

        String inf = "информатика";

        char[] arrayInf = inf.toCharArray();

        char[] arrayOR = new char[2];

        System.arraycopy(arrayInf,3,arrayOR,0,2);

        String tort = ""+arrayInf[7]+ arrayOR[0]+arrayOR[1]+arrayInf[7];

        System.out.println(tort);
    }
}
