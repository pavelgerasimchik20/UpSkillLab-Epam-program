package strings.asStringBuilder;

public class Task3 { // Проверить, является ли заданное слово палиндромом.

    public static void main(String[] args) {

        StringBuilder fin = new StringBuilder("saippuakivikauppias");
        StringBuilder rus = new StringBuilder("велосипедист");
        System.out.println(isPalindrome(fin));
        System.out.println(isPalindrome(rus));
    }

    private static boolean isPalindrome(StringBuilder str) {
        String tmp = String.valueOf(str);
        str.reverse();
        if (tmp.equals(str.toString())) {
            return true;
        } else {
            return false;
        }
    }

}
