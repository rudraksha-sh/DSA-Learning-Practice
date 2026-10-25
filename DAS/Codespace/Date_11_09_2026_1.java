package DAS.Codespace;
import java.util.HashMap;

public class Date_11_09_2026_1 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,1,0,0};
        int count=0;
        int prefixSum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                prefixSum--;
            }else prefixSum++;

            if(map.containsKey(prefixSum)){
                int c=i-map.get(prefixSum);
                count=Math.max(c, count);
            }else map.put(prefixSum, i);
        }

        System.out.print(count);


    }
}
