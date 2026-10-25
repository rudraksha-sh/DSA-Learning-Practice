package DAS.Codespace;
import java.util.HashMap;

public class Date_08_09_2026_2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, -1, 3, -2, 4 };
        int k = 3;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int prefixSum=0,maxlen=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int required = prefixSum-k;
            if(map.containsKey(required)){
                int len = i-map.get(required);
                maxlen=Math.max(len, maxlen);
            }
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
        }

        System.out.println(maxlen);
    }
}
