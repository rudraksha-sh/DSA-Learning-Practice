package DAS.Codespace;
public class Date_09_09_2026_1 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,1,0,0};
        int count=0,countone=0,countzero=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)countzero++;
            else countone++;
            if(countone==countzero){
                count+=countone*2;
                countone=0;
                countzero=0;
            }
        }
        System.out.println(count);
    }
}
