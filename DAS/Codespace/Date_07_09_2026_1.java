package DAS.Codespace;
import java.util.HashMap;

public class Date_07_09_2026_1{
    public static void main(String[] args) {

        int[] nums = {1, -1, 5, -2};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 exists before the array starts
        map.put(0, -1);

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            // Calculate current prefix sum
            prefixSum += nums[i];

            // Prefix sum we need to find
            int required = prefixSum - k;

            // If required prefix sum exists
            if (map.containsKey(required)) {

                int length = i - map.get(required);

                maxLength = Math.max(maxLength, length);
            }

            // Store only the first occurrence
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        System.out.println(maxLength);
    }
}