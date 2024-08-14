package easy;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums){
        int n = nums.length;
        int singleNum = 0;
        for(int i =0; i<n; i++){
          singleNum = singleNum ^nums[i];
        }
        return singleNum;
    }
}