import java.sql.Array;
import java.util.Arrays;

public class shell {
    public static void main(String[] args) {
        int[] array = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        shell(array);
        System.out.println(Arrays.toString(array));
    }
    public static void shell(int[] array) {
        int gap = 4;

        //for(int i = gap; i < array.length; i++) {
        int i = gap;
        while(i < array.length) {
            for(int j = i; j >= gap; j = j - gap) {
                if (array[j] < array[j-gap]) {
                    int temp = array[j-gap];
                    array[j-gap] = array[j];
                    array[j] = temp;
                }
            }
            i++;
            if(array.length == i) {

                gap = gap / 2;
                i = gap;
                if (gap < 1) {
                    break;
                }
            }

        }
    }
}
