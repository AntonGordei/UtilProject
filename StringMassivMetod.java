
import java.util.Arrays;

public class StringMassivMetod {

    public static void main(String[] args) {

        String [] array = {"aaa", "hh", "fghj y"};
        System.out.println("1. " + Arrays.toString(sortArray(array)));
        System.out.println("2. " + searchMin(array));
        System.out.println("3. " + withoutSpaces(array));
        System.out.println("4. " + reverseArray(array));

    }

    public static String[] sortArray(String[] array) {
        String [] arr1 = array;
        Arrays.sort(arr1);
        return arr1;
    }

    public static String searchMin(String[] array) {
        String [] arr1 = array;
        String x = array [0];
        int a = x.length();
        for (int i = 1; i < arr1.length; i++)
            if (a > array [i].length()) x = array [i];
        return x;
    }

    public static String withoutSpaces(String[] array) {
        String [] arr1 = array;
        String x = String.join(" ", arr1);
        return x;
    }

    public static String reverseArray(String[] array) {
        String [] arr1 = array;
        String x = String.join(" ", arr1);
        char [] y = x.toCharArray();
        String res = "";
        for (int i = array.length-1; i>=0; i--) {
            res = res + array [i];
        }
        return res;
    }

}
