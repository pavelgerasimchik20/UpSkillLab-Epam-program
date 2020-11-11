package algorithmization.onedimensional;

public class Task5 { // Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
    public static void main(String[] args) {


        int [] array = new int[]{1,-14,17,0,8,-2,4,114,-56,-2,5,1,-1,2,-8,1,5,-6,-4,10,90};
        String  count= " ";
        for (int i = 0; i< array.length;i++){
            if (array[i]>i){
                count+=" ";
                System.out.println(count+array[i]);
            }
        }
    }
}
