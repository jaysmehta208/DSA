import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int[] array = {7,6,5,4,3,2,1};
        quicc(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    /***
    public static void completeQuickSort(int[] array) {
        quicc(array,0,array.length-1);

    }
**/
    public static void quicc(int[] array, int l, int r) {
        if(l >= r) {
            return;
        }
        int pivot = r ;
        int i = l-1;
        for (int j = l; j < r; j++) {
            if(array[j] < array[pivot]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp2 = array[i + 1];
        array[i + 1] = array[pivot];
        array[pivot] = temp2;
        quicc(array, l, i);
        quicc(array, i+2, r);
    }
}
