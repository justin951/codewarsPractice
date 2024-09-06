import java.util.Arrays;

public class EqualSumsEitherSideOfIndex {
    public static int findEvenIndex(int[] arr) {
        System.out.println(Arrays.toString(arr));

        int indexValue = 0;

        int[] left = Arrays.copyOfRange(arr, 0, indexValue);
        int[] right = Arrays.copyOfRange(arr, indexValue, arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (Arrays.stream(left).sum() == Arrays.stream(right).sum()) {
                return indexValue;
            }
            indexValue++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
        System.out.println(findEvenIndex(arr));
    }
}
