import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] array = {7,6,5,4,3,2,1};
        selectionsort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void selectionsort(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int min  = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[min]) {

                    min = j;
                }
            }
            if (min != i) {
                counter++;

                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.println(counter);
    }

}
