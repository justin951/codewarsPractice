import java.util.HashMap;
import java.util.Map;

public class FindUnique {
    public static double findUnique(double arr[]) {
        HashMap<Double, Integer> count = new HashMap<>();

        for (double each : arr) {
            count.put(each, count.getOrDefault(each, 0) +1);
        }

        Double keyWithValueOne = getKeyForValue(count, 1);
        
        return keyWithValueOne;
        
    }

    public static double getKeyForValue(HashMap<Double, Integer> map, int target) {
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(target)) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        double[] arr = { 1, 1, 1, 2, 1, 1 };
        System.out.println(findUnique(arr));
        System.out.println(alternateUnique(arr));
    }

    public static double alternateUnique(double arr[]) {
        final double duplicate = arr[arr[0] == arr[1] ? 0 : 2];

        for (double value : arr ) {
            if (value != duplicate) {
                return value;
            }
        }
        
        throw new RuntimeException("no unique number found");
    }
}
