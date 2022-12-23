import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] a = {8,7,6,5,4,3,2,1};
        bubblesort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubblesort(int[] A) {
        int l = A.length;
        for (int i = 0; i < l-1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (A[j] > A[j+1]) {
                    int temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
}
