package DAS.Codespace;
public class Date_08_09_2026_1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, -1, 3, -2, 4 };
        int k = 3;
        int maxlen = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k && maxlen < j - i + 1) {
                    maxlen = j - i + 1;
                }
            }
        }
            System.out.println(maxlen);
        }
    }
