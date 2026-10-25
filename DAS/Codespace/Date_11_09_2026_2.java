package DAS.Codespace;
import java.util.HashMap;

public class Date_11_09_2026_2 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1};
        int target = 2;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            int required = prefixSum - target;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println(count);
    }
}