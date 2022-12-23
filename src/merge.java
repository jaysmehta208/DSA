import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] array = {7,6,5,4,3,2,1};
        mergeSort(array, 0, 6);
        //System.out.println(array);
    }
    public static void mergeSort(int[] array, int l, int r) {

        if ((l < r)) {
            int m = l + ((r - l) / 2);
                mergeSort(array, l, m);
                mergeSort(array, m + 1, r);
        }
    }
    public static int[] copy(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        return null;
    }
}
