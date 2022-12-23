import java.util.Arrays;

public class counting {
    public static void main(String[] args) {
        int[] array = {1,4,1,2,5,7,2};
        countingSort(array);
        //System.out.println(Arrays.toString(array));
    }
    public static void countingSort(int[] array) {
        int[] array2 = new int[8];
        for(int i = 0; i < array.length; i++) {
            array2[array[i]] = array2[array[i]] + 1;
        }
        int size = 0;
        //System.out.println(Arrays.toString(array2));
        for(int i = 0; i < array2.length; i++) {
            size = array2[i] + size;
            array2[i] = size;
        }
        //System.out.println(Arrays.toString(array2));
        int[] array3 = new int[array.length];
        for(int j = array.length-1; j >= 0; j--) {

            array3[array2[array[j]]-1] = array[j];
            array2[array[j]] =  array2[array[j]] - 1;
        }
        System.out.println(Arrays.toString(array3));
    }
}
