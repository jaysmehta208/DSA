import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        insertionsort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertionsort(int[] array) {
        int counter = 0;
        for(int i = 1; i < array.length; i++) {
            for(int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    counter++;
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}
