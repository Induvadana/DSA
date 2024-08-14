package easy;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = new int[]{3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int nums[]){
        int n = nums.length;
      int natural = n*(n+1)/2;
      int sum =0;
      for(int i=0; i<n;i++){
          sum = sum+nums[i];
      }
      return natural -sum;
    }
}
